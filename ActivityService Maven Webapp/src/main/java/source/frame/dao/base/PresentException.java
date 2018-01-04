package source.frame.dao.base;

public class PresentException extends SystemBaseException {

	private String typeCode;

	public PresentException(String typeCode, String msg, Throwable cause) {
		super(msg, cause);
		this.typeCode = typeCode;
	}

	public PresentException(String typeCode, String msg) {
		super(msg);
		this.typeCode = typeCode;
	}
	
	
	

}
