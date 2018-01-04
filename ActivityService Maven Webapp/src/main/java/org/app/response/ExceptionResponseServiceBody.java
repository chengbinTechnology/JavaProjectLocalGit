package org.app.response;

import java.util.HashMap;
import java.util.Map;

import org.app.ResponseServiceBody;

public class ExceptionResponseServiceBody implements ResponseServiceBody {

	private String exType;
	private String message;
	private String code;

	public String getExType() {
		return exType;
	}

	public void setExType(String exType) {
		this.exType = exType;
	}

	public String getMessage() {
		return message;
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

	
	@Override
	public Object getContent() {
		Map map=new HashMap();
		map.put("exType", this.getExType());
		map.put("message", this.getMessage());
		map.put("code",this.getCode());
		return map;
	}

}
