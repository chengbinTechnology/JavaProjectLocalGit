package org.app;

import org.springframework.web.context.WebApplicationContext;


/**
 * 容器内容池
 * @author chengyuxuan
 *
 */
public interface Context {
	
	public final static Context SQLDContext=SQLDStaticContext.getInstance();
	public Object get(String namespace,String name);
	public void put(String namespace,String name,Object value);
}
