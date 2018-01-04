package org.quickcode.frame.Interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.app.AppAnnotation;
import org.app.ResultContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class AuthInterceptor  implements HandlerInterceptor {

	private Logger logger = Logger.getLogger(AuthInterceptor.class);

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		return;
	}

	
	/**
	 * Session共享的身份过滤器
	 */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) {
			HandlerMethod hmethod = (HandlerMethod) arg2;
			HttpServletRequest request = arg0;
			HttpServletResponse response=arg1;
			logger.info("加入编码转换与控制\n--------------------------------------------------");
			
			logger.info("加入编码转换与控制\n--------------------------------------------------");
			return true;
	}

}
