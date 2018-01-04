package org.app.response;

import java.util.HashMap;
import java.util.Map;

import org.app.ResponseServiceBody;

public class ProduceResponseServiceBody implements ResponseServiceBody {
	
	private String responseType;
	private Object body;

	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	@Override
	public Object getContent() {
		Map map=new HashMap();
		map.put("type", this.getResponseType());
		map.put("body", this.getBody());
		return map;
	}

}
