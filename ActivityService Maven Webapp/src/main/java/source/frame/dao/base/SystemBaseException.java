package source.frame.dao.base;

public class SystemBaseException extends Exception{
	
	public SystemBaseException(String message,Throwable cause){
		super(message,cause);
	}
	
	public SystemBaseException(String message){
		super(message);
	}
}
