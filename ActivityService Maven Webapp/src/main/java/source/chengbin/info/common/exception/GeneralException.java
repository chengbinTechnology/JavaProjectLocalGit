package source.chengbin.info.common.exception;

public class GeneralException extends Exception {

	private String code;
	private String message;

	public GeneralException(String code, String message) {
		super(message);
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
