package org.app.response;

public enum ResponseStatus {
	//1 执行成功\0 业务异常 \ -1 系统级异常
	ACCOMPLISH(1),EXCEEDINGLY(0),ABNORMITY(-1);
	private int status;
	private ResponseStatus(int state){
		this.status=state;
	}
	
	public int getStatus(){
		return this.status;
	}
	
}
