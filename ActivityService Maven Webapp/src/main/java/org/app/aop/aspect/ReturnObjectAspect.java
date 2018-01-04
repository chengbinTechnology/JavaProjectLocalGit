package org.app.aop.aspect;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.app.ErrorBody;
import org.app.ResponseServiceBody;
import org.app.ResultBody;
import org.app.ResultContext;
import org.app.response.ExceptionResponseServiceBody;
import org.app.response.ProduceResponseServiceBody;
import org.app.response.ResponseStatus;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import redis.clients.jedis.Transaction;
import source.frame.dao.base.SystemBaseException;

//用切入点来进行错误的输出,与反馈错误信息的输出!
//@Aspect
public class ReturnObjectAspect {

	protected Logger logger = Logger.getLogger(ReturnObjectAspect.class);

	// @Pointcut("execution(public * com.doper.card.controller.*.*(..))")
	public void anyMethod() {
		System.out.println("声明一个切入点");
	}

	// @Before("anyMethod()&&args(username)")
	public void doAccessCheck(String username) {
		System.out.println("定义前置通知...并传参数" + username);
	}

	// @AfterReturning(pointcut = "anyMethod()", returning = "relvalue")
	public void doAfterReturning(Object returnValue) {
		System.out.println(returnValue);
		System.out.println("定义后置通知...执行返回String类型的方法");
		returnValue = "name is a test";
	}

	// @After("anyMethod()")
	public void doAfter() {
		System.out.println("定义最终通知");
	}

	// @AfterThrowing(pointcut = "anyMethod()", throwing = "e")
	// 定义异常通知（当所拦截的方法出现异常时）
	public void doAfterThrowing(Exception e) {
		System.out.println(e.getMessage());
	}

	
	// @Around("anyMethod()")
	// 定义环绕通知
	public Object doBasicProfiing(ProceedingJoinPoint pjp) {
		Object returnObj=null;
		MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
		Method method = methodSignature.getMethod();
		logger.info("进入类:" + pjp.getTarget().getClass() + "的方法:"+method.getName()+"\n"); // 可以记录日志信息,加入执行时间等信息
		ResultBody result=new ResultBody();
		boolean isResponseBody=false;
		try{
		    ResponseBody responseBody=method.getAnnotation(ResponseBody.class);
		    if(responseBody!=null){
		    	 isResponseBody=true;
		    }else{
		    	 isResponseBody=false;
		    }
		}catch(NullPointerException e){
			isResponseBody=false;
		}
		try {
			logger.info("start execute method.............................");
			returnObj = pjp.proceed(); // 此方法是必须
			long tid=Thread.currentThread().getId();
			logger.info("CurrentThreadId:::::::"+tid);
			//业务执行成功时,应该返回的结果
			if(!isResponseBody){
				return returnObj;
			}else{
				ProduceResponseServiceBody serviceBody=new ProduceResponseServiceBody();
				serviceBody.setResponseType("text/json");
				serviceBody.setBody(returnObj);
				result.setResponseStatus(ResponseStatus.ACCOMPLISH);
				result.setResponseContent(serviceBody);
			}
		} catch (SystemBaseException e) { //发生业务错误时,对不同的情况的返回数据
			logger.error(e.getMessage(),e);
			ExceptionResponseServiceBody serviceBody=new ExceptionResponseServiceBody();
			//根据异常发生的实际情况,来定义异常的类型,如交互的、业务处理的、数据查询的、接口调用的
			serviceBody.setExType("1");
			serviceBody.setMessage(e.getMessage());
			serviceBody.setCode("101");
			if(!isResponseBody){
			 	return new ModelAndView("global/globalErrorView", "ExDetail", serviceBody);
			}else{
				result.setResponseStatus(ResponseStatus.EXCEEDINGLY);
				result.setResponseContent(serviceBody);
			}
			return result;
		} catch(Throwable e){
			logger.error(e.getMessage(),e);
			ExceptionResponseServiceBody serviceBody=new ExceptionResponseServiceBody();
			serviceBody.setExType("0");
			serviceBody.setMessage("系统不可用,请联系客服中心!");
			serviceBody.setCode("10000");
			if(!isResponseBody){
			 	return new ModelAndView("global/globalErrorView", "ExDetail",serviceBody);
			}else{
				result.setResponseStatus(ResponseStatus.ABNORMITY);
				result.setResponseContent(serviceBody);
			}
			return result;
		}finally{
			logger.info("退出方法" + pjp.getTarget().getClass()+"------"+method.getName() + "\n");
		}
		return result;
	}
}
