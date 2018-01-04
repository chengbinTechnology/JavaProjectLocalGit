package org.app;

import org.app.response.ResponseStatus;

public class ResultBody {
	private ResponseStatus responseStatus; // 请求应答状态
	private ResponseServiceBody responseContent; // 请求应答内容

	public int getResponseStatus() {
		return responseStatus.getStatus();
	}

	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	public Object getResponseContent() {
		return responseContent.getContent();
	}

	public void setResponseContent(ResponseServiceBody responseContent) {
		this.responseContent = responseContent;
	}
}
