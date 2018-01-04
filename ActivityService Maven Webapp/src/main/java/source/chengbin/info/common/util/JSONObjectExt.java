package source.chengbin.info.common.util;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.log4j.Logger;


public class JSONObjectExt {
	
	protected Logger logger = Logger.getLogger(JSONObjectExt.class);
	private String StringToJSON(String source){
		return source;
	}
	
	
	private String toWriteObject(String sb){
		String oldStr=sb;
		//logger.warn("outputStr_old:"+oldStr);
		String newStr=StringEscapeUtils.escapeEcmaScript(oldStr);
		//StringEscapeUtils.unescapeEcmaScript(input)
		//logger.warn("outputStr_new:"+newStr);
		return newStr;
		
	}
	
	 
	
	
	 private Map map = new HashMap();

	  public static JSONObjectExt formObject(Map map)
	  {
	    return new JSONObjectExt(map);
	  }

	  public JSONObjectExt()
	  {
	  }

	  public JSONObjectExt(Map map)
	  {
	    this.map = map;
	  }

	  public JSONObjectExt put(String key, boolean value) {
	    this.map.put(key, Boolean.valueOf(value));
	    return this;
	  }

	  public JSONObjectExt put(String key, Date date) {
	    this.map.put(key, date);
	    return this;
	  }

	  public JSONObjectExt put(String key, int value) {
	    this.map.put(key, Integer.valueOf(value));
	    return this;
	  }

	  public JSONObjectExt put(String key, long value) {
	    this.map.put(key, Long.valueOf(value));
	    return this;
	  }

	  public JSONObjectExt put(String key, Object value) {
	    this.map.put(key, value);
	    return this;
	  }

	  public JSONObjectExt putAll(Map map) {
	    this.map.putAll(map);
	    return this;
	  }
	  
	  public JSONObjectExt pushAll(Map map){
		  Set keySet=map.keySet();
		  Iterator it=keySet.iterator();
		  while(it.hasNext()){
			  Object obj=it.next();
			  this.map.put(obj, map.get(obj));
		  }
		  return this;
	  }
	  
	  
	  
	  public Object get(String key){
		  return this.map.get(key);
	  }
	  
	  
	  public JSONObjectExt getJSON(String key){
		  return (JSONObjectExt)this.map.get(key);
	  }
	  
	  
	  public Map getMap(){
		  return this.map;
	  }
	  
	  

	  public String toString() {
	    StringBuffer sb = new StringBuffer();
	    Iterator it = this.map.keySet().iterator();
	    int i = 0;
	    sb.append("{");
	    while (it.hasNext()) {
	      String keystr = it.next().toString();
	      Object value = this.map.get(keystr);
	      if (value != null) {
	        if (value instanceof String){
	          value = "\"" + toWriteObject((String)value) + "\"";
	        }else if(value instanceof Timestamp ){
	           value="\""+StringToJSON(DateFormat.DateToString((Date)value,"yyyy-MM-dd"))+"\"";		
	        }else if(value instanceof Date){
	           value="\""+StringToJSON(DateFormat.DateToString((Date)value,"yyyy-MM-dd"))+"\"";	
	        }
	      }
	      if (i > 0)
	        sb.append(",\"" + keystr + "\":" + value);
	      else {
	        sb.append("\"" + keystr + "\":" + value);
	      }
	      ++i;
	    }
	    sb.append("}");

	    return sb.toString();
	  }
}
