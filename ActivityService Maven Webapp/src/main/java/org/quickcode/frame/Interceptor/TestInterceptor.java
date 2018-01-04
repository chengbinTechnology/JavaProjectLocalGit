package org.quickcode.frame.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

  

public class TestInterceptor implements HandlerInterceptor{

	Logger logger=Logger.getLogger(TestInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		logger.info("this is a interceptor");
		return true;
	}
 
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		  logger.info(response.getBufferSize());
		  logger.info("this is a interceptor to do "+modelAndView);
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception { //在这里可以在request中加上属性
		logger.info(handler);
		 logger.info(response.getBufferSize());
		logger.info(response);
		logger.info("this is a handler clear");
		
	}

	
	
	
	
	
	
}
