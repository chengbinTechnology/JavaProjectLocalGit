package source.chengbin.info.common.util;

public class OperationButton {
	
	private String id; // 页面ID
	private String name; // 按钮名称
	private String desc; // 按钮显示名称
	private String roleBit; // 权限位
	private String handler; // 按钮操作的事件
	
	
	
	public OperationButton(String id,String name,String desc,String roleBit,String handler){
		this.id=id;
		this.name=name;
		this.desc=desc;
		this.roleBit=roleBit;
		this.handler=handler;
	}
	
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRoleBit() {
		return roleBit;
	}

	public void setRoleBit(String roleBit) {
		this.roleBit = roleBit;
	}

	public String getHandler() {
		return handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

}
