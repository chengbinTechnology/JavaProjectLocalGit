package org.app;

import java.util.HashMap;
import java.util.Map;


/**
 * SQLD的内容管理器
 * @author chengyuxuan
 *
 */
public class SQLDStaticContext implements Context{
	
	private static Context context=null;
	
	
	private SQLDStaticContext(){
		
	}
	
	public static Context getInstance(){
		if(context==null){
			context=new SQLDStaticContext();
		}
		return context;
	}
	

	private  Map<String,Map<String,Object>> sqldMap=new HashMap();
	
	@Override
	public Object get(String namespace,String name) {
		// TODO Auto-generated method stub
		Map entity=sqldMap.get(namespace);
		if(entity==null){
			return null;
		}
		return entity.get(name);
	}

	@Override
	public void put(String namespace,String name, Object value) {
		// TODO Auto-generated method stub
		Map entity=sqldMap.get(namespace);
		if(entity==null){
			entity=new HashMap<String,Object>();
			sqldMap.put(namespace, entity);
		}
		entity.put(name, value);
	}

	
	
	
}
