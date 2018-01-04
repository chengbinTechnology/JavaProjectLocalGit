package source.frame.dao.plus;

import java.util.ArrayList;
import java.util.List;

public class BatchUpdateObject {
    private String methodName;
    private Object updateObject;
    
    public BatchUpdateObject(String methodName,Object updateObject){
    	this.methodName=methodName;
    	this.updateObject=updateObject;
    }
    
    
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public Object getUpdateObject() {
		return updateObject;
	}
	public void setUpdateObject(Object updateObject) {
		this.updateObject = updateObject;
	}

	public static List<BatchUpdateObject> createList(){
		return new ArrayList<BatchUpdateObject>();
	}
	
	
    
}
