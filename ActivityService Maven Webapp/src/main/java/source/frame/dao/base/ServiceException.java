package source.frame.dao.base;

public class ServiceException  extends SystemBaseException{
	
    private String typeCode;
	
	public ServiceException(String typeCode,String msg,Throwable cause){
		super(msg,cause);
		this.typeCode=typeCode;
	}
	
	public ServiceException(String typeCode,String msg){
		super(msg);
		this.typeCode=typeCode;
	}
	
	
	
}
