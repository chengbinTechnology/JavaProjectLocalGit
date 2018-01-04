package source.chengbin.info.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EntryListValueMap<T> extends HashMap<String,List<T>>  implements java.io.Serializable{

    private static final long serialVersionUID=201404120989098L;
	
	public void putItem(String key,T value){
		if(this.get(key)!=null){
			List<T> list=(List<T>)this.get(key);
			list.add(value);
		}else{
			List<T> list=new ArrayList<T>();
			list.add(value);
			this.put(key, list);
		}
	}
	

	
	
	
	
	
}
