package source.chengbin.info.common.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTree extends HashMap<String,Map<String,String>> {
    
	public void putItem(String dict_name,String dict_key,String value){
		if(this.get(dict_name)!=null){
			Map<String,String> dict=this.get(dict_name);
			dict.put(dict_key, value);
		}else{
			Map<String,String> dict=new TreeMap<String,String>();
			dict.put(dict_key, value);
			this.put(dict_name, dict);
		}
	}

	
	
	
	
}
