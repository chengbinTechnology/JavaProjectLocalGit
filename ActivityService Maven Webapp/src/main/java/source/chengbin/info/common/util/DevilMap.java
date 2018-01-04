package source.chengbin.info.common.util;

import java.util.HashMap;

public class DevilMap extends HashMap<String,JSONArrayExt>{

	public void putItem(String key,Object value){
		if(this.get(key)!=null){
			JSONArrayExt array=this.get(key);
			array.add(value);
		}else{
			JSONArrayExt array=new JSONArrayExt();
			array.add(value);
			put(key,array);
		}
	}

	
	
	
	
	
}
