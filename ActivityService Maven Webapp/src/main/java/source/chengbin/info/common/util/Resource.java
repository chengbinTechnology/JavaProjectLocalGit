package source.chengbin.info.common.util;

import java.net.URL;

public class Resource {
    
	public static URL getResource(String resource){
		return Resource.class.getResource(resource);
	}
	
	public static final String JSDEFAULTPATH="/com/cbin/cms/ext/scriptFile";
	
	
	
}
