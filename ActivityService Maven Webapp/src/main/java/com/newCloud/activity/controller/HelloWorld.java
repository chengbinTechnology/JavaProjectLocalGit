package com.newCloud.activity.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import source.frame.dao.base.SystemBaseException;
import source.frame.dao.plus.Pagination;
import source.frame.dao.plus.impl.HibernatePageination;

import com.newCloud.activity.service.ITestService;

@Controller
@RequestMapping("/test")
public class HelloWorld {
	
	Logger logger=Logger.getLogger(HelloWorld.class);
	
	@Autowired
	private ITestService testService;
	
	@Autowired
	private ITestService testHqlService;
	
	@RequestMapping("/hello.do")
	@ResponseBody
	public Object getMessage(Model model,HttpServletRequest request) throws SystemBaseException{
		//Logger.getLogger(HelloWorld.class).info(request.getContentType());
		model.addAttribute("message", "helloWorld");
		//Logger.getLogger(HelloWorld.class).info("this is running");
		return null;
	}
	
	@RequestMapping("/json.do")
	@ResponseBody
	public Object getResponseMessage(Model model,HttpServletRequest request) throws SystemBaseException{
		//Logger.getLogger(HelloWorld.class).info(request.getContentType());
		model.addAttribute("message", "helloWorld");
		//Logger.getLogger(HelloWorld.class).info("this is running");
		return testService.getRuData();
	}
	
	
	@RequestMapping("/doRequest.do")
	public Object doRequest(Model model,HttpServletRequest request,HttpServletResponse response) throws SystemBaseException{
		//Logger.getLogger(HelloWorld.class).info(request.getRequestURI());
		model.addAttribute("message", "helloWorld");
		//Logger.getLogger(HelloWorld.class).info("this is running model");
		List<Map>  runDatas=testService.getRuData();
		//Logger.getLogger(HelloWorld.class).info(runDatas.size());
		Pagination pagenation=new HibernatePageination(3,1);
		try{
			runDatas=testService.getRuDataByPage(pagenation);
		}catch(SystemBaseException e){
			throw e;
		}
		//Logger.getLogger(HelloWorld.class).info(runDatas.size());
		return "mainService/doRequest";
	}
	
	
	
	@RequestMapping("/doHql.do")
	public Object doHqlRequest(Model model,HttpServletRequest request,HttpServletResponse response) throws SystemBaseException{
		Logger.getLogger(HelloWorld.class).info(request.getRequestURI());
		model.addAttribute("message", "do the model views");
		Logger.getLogger(HelloWorld.class).info("this is running model");
		List<Map>  runDatas=testService.getRuData();
		Logger.getLogger(HelloWorld.class).info(runDatas.size());
		Pagination pagenation=new HibernatePageination(3,1);
		try{
		runDatas=testHqlService.getRuDataByPage(pagenation);
		}catch(Exception e){
			e.printStackTrace();
		}
		Logger.getLogger(HelloWorld.class).info(runDatas.size());
		return "mainService/doRequest";
	}
	
	@RequestMapping("/updateTransaction.do")
	@ResponseBody
	public Object doUpdate(Model model,HttpServletRequest request,HttpServletResponse response) throws SystemBaseException{
		logger.info(model);
		return testHqlService.updateProjectInfo();
	}
	
	
	
	
	
}
