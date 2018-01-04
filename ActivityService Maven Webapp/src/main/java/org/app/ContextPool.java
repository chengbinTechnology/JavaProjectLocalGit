package org.app;

import org.springframework.web.context.WebApplicationContext;



/**
 * 快速访问上下文池的Context
 * @author chengyuxuan
 *
 */
public class ContextPool {
	
	private static ContextPool instance=null;
	
	private Context sqldContext; // SQLD的上下文容器
	private WebApplicationContext appContext; // spring的上下文容器

	public Context getSqldContext() {
		return sqldContext;
	}

	public void setSqldContext(Context sqldContext) {
		this.sqldContext = sqldContext;
	}

	public WebApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext(WebApplicationContext appContext) {
		this.appContext = appContext;
	}
	
	private ContextPool(){
		
	}
	
	
	/**
	 * 单例模式
	 * @return
	 */
	public static ContextPool getInstance(){
		if(instance==null){
			instance=new ContextPool();
		}
		return instance;
	}
	

}
