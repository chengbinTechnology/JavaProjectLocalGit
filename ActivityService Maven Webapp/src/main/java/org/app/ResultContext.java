package org.app;

public class ResultContext {
	private int status; // 返回状态
	private Object dataBody; // 返回的数据实体

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getDataBody() {
		return dataBody;
	}

	public void setDataBody(Object dataBody) {
		this.dataBody = dataBody;
	}

}
