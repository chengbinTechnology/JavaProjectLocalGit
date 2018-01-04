package source.chengbin.info.common.bean;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import source.chengbin.info.common.exception.GeneralException;
import source.chengbin.info.common.util.JSONObjectExt;


public class BeanTransFormer {
   
	
	/**
	 * 对象转换为Map,注意，对于对象是Collection的，Map的，以及JSONObjectExt的，都直接返回。
	 * @param obj
	 * @return
	 * @throws IllegalAccessException
	 */
	public static Map ObjectToMap(Object obj) throws IllegalAccessException{
		if(obj instanceof Collection){
			return null;
		}
		if(obj instanceof Map){
			return (Map)obj;
		}
		if(obj instanceof JSONObjectExt){
			return ((JSONObjectExt)obj).getMap();
		}
		Map map=new HashMap();
		Field[] fields=obj.getClass().getDeclaredFields();
		for(int i=0;i<fields.length;i++){
			Field field=fields[i];
			if(field!=null){
				field.setAccessible(true);
				map.put(field.getName(), field.get(obj));
			}
		}
		return map;
	}
	
	
	
	public static Map<String,Object> ArrayToMap(String[] keyArray,Object[] valueArray) throws GeneralException{
		if(keyArray.length>valueArray.length){
			throw new GeneralException("","ArrayToMap >> ArrayKey.length > valueArray.length");
		}
		Map<String,Object> map=new HashMap<String,Object>();
		for(int i=0;i<keyArray.length;i++){
			map.put(keyArray[i], valueArray[i]);
		}
		return map;
	}
	
	
	
	
	/**
	 * Map对象转换为Object
	 * @param map
	 * @param obj
	 * @return
	 * @throws IllegalAccessException
	 */
	public static Object MapToObject(Map map,Object obj) throws IllegalAccessException{
		if(map==null){
			return obj;
		}
		if(obj==null){
			return null;
		}
		Set set=map.keySet();
		Iterator it=set.iterator();
		Class objClass=obj.getClass();
		while(it.hasNext()){
			Object key=it.next();
			 Field field=null;
			if(key!=null){
				try{
				   field=objClass.getDeclaredField((String)key);
				}catch(NoSuchFieldException e){
				   field=null;
				}
				if(field!=null){
					field.setAccessible(true);
					field.set(obj, map.get(key));
				}
			}
		}
		return obj;
	}
	
	
	
	
	
	
	
	
	
	
}
