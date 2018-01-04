package source.chengbin.info.common;

import java.net.URLEncoder;

import org.apache.http.NameValuePair;



public class QueryEntity implements NameValuePair{

	private String name;
	private String value;
	
	public static QueryEntity createEntity(String name,String value){
		return new QueryEntity(name,value);
	}
	
	public QueryEntity(String name,String value){
		this.name=name;
		this.value=value;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return URLEncoder.encode(name);
	}
	
	

	public String getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	
	
	
}
