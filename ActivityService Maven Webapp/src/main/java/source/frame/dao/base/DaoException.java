package source.frame.dao.base;

public class DaoException extends SystemBaseException {
    
	private String typeCode;
	
	public DaoException(String typeCode,String msg,Throwable cause){
		super(msg,cause);
		this.typeCode=typeCode;
	}
	
	
	
	
	
	
}
