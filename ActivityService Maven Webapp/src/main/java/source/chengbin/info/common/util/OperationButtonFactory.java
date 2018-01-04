package source.chengbin.info.common.util;

import java.util.List;

public interface OperationButtonFactory {
	/**
	 * 用户操作
	 */
	public OperationButton saveUser=new OperationButton("save_user","saveUser","保存","0000011","saveUser");
	public OperationButton delUser=new OperationButton("del_user","delUser","删除","0000010","delete");
	public OperationButton subUser=new OperationButton("sub_user","subUser","提交","0000010","submit");
	/**
	 * 学生信息操作
	 * @param itemId
	 * @param roleBit
	 * @return
	 */
	public OperationButton saveStudent=new OperationButton("save_sutdent","saveStudent","保存信息","0000111","saveStudent");
	public OperationButton submitStudent=new OperationButton("submit_sutdent","submitStudent","提交信息","0000011","submitStudent");
	public OperationButton auditStudent=new OperationButton("audit_student","auditStudent","审批通过","0001000","auditStudent");
	public OperationButton rejectStudent=new OperationButton("reject_student","rejectStudent","审批退回","0001000","rejectStudent");
	public OperationButton uploadPic=new OperationButton("uploadPic","uploadPic","上传相片","0000111","uploadPic");
	/**
	 * 学生管理操作
	 * @param itemId
	 * @param roleBit
	 * @return
	 */
	public OperationButton viewStudent=new OperationButton("view_student","viewStudent","编辑","1111111","viewStudent");
	public OperationButton batchViewStudent=new OperationButton("batch_view_student","batchViewStudent","批量审批","0101000","batchViewStudent");
	public OperationButton exportStudentBySelect=new OperationButton("export_select_student","exportStudentBySelect","导出所选信息","0101000","exportStudentBySelect");
	public OperationButton exportStudentByCondition=new OperationButton("export_condition_student","exportStudentByCondition","导出符合条件信息","0101000","exportStudentByCondition");
	public OperationButton importStudentInfo=new OperationButton("import_student_info","importStudentInfo","导入学生","0101000","importStudentInfo");
	/**
	 * 年度学业信息管理操作
	 */
	public OperationButton addStudentYear=new OperationButton("add_student_year","addStudentYear","增加","0000011","addStudentYear");
	public OperationButton viewStudentYear=new OperationButton("view_student_year","viewStudentYear","编辑","0000011","viewStudentYear");
	public OperationButton auditStudentYear=new OperationButton("audit_student_year","viewStudentYear","审批","0101000","viewStudentYear");
	public OperationButton batchAuditStudentYear=new OperationButton("batch_audit_student_year","batchAuditStudentYear","批量审批","0101000","batchAuditStudentYear");
	public OperationButton exportStudentYearBySelect=new OperationButton("export_select_student_year","exportStudentYearInfoBySelect","导出所选信息","0101000","exportStudentYearInfoBySelect");
	public OperationButton exportStudentYearByCondition=new OperationButton("export_condition_student","exportStudentYearByCondition","导出符合条件信息","0101000","exportStudentYearByCondition");
	/**
	 * 年度信息操作
	 * @param itemId
	 * @param roleBit
	 * @return
	 */
	public OperationButton saveStudentYear=new OperationButton("save_sutdent_year","saveStudentYear","保存信息","0000011","saveStudentYear");
	public OperationButton submitStudentYear=new OperationButton("submit_sutdent_year","submitStudentYear","提交信息","0000011","submitStudentYear");
	public OperationButton auditStudentYearInfo=new OperationButton("audit_student_year","auditStudentYearInfo","审批通过","0001000","auditStudentYearInfo");
	public OperationButton rejectStudentYear=new OperationButton("reject_student_year","rejectStudentYear","审批退回","0001000","rejectStudentYear");
	/**
	 * 成员信息与附件
	 */
	public OperationButton addMember=new OperationButton("add_member","addMember","增加成员","0000010","addMember");
	public OperationButton viewMember=new OperationButton("view_member","viewMember","查看成员","0000010","viewMember");
	public OperationButton deleteMember=new OperationButton("del_member","deleteMember","删除成员","0000010","deleteMember");
	public OperationButton addAttch=new OperationButton("add_attch","addAttch","上传附件","0000010","addAttch");
	public OperationButton deleteAttch=new OperationButton("delete_attch","deleteAttch","删除附件","0000010","deleteAttch");
	
	public OperationButton addTeacher=new OperationButton("add_teacher","addTeacher","增加指导老师","0000010","addTeacher");
	public OperationButton viewTeacher=new OperationButton("view_teacher","viewTeacher","查看成员","0000010","viewTeacher");
	public OperationButton deleteTeacher=new OperationButton("del_teacher","deleteTeacher","删除指导老师","0000010","deleteTeacher");
	
	public OperationButton addForOrg=new OperationButton("add_for_org","addForOrg","增加分发组织","0000011","addForOrg");
	public OperationButton delForOrg=new OperationButton("del_for_org","delForOrg","删除分发组织","0000011","delForOrg");
	public OperationButton addForUser=new OperationButton("add_for_user","addForUser","增加分发用户","0000011","addForUser");
	public OperationButton delForUser=new OperationButton("del_for_user","delForUser","删除分发用户","0000011","delForUser");
	/**
	 * 流程信息按钮
	 */
	public OperationButton saveApplyService=new OperationButton("save_apply_service","saveApplyService","保存","0000011","saveApplyService");
	public OperationButton submitApplyService=new OperationButton("submit_apply_service","submitApplyService","提交","0000010","submitApplyService");
	public OperationButton auditApplyService=new OperationButton("audit_apply_service","auditApplyService","审批","0001000","auditApplyService");
	public OperationButton rejectApplyService=new OperationButton("reject_apply_service","rejectApplyService","退回","0001000","rejectApplyService");
	public OperationButton addServiceAttch=new OperationButton("add_attch","addServiceAttch","上传附件","0000010","addServiceAttch");
	public OperationButton deleteServiceAttch=new OperationButton("delete_attch","deleteServiceAttch","删除附件","0000010","deleteServiceAttch");
	public OperationButton exportDetailApplyService=new OperationButton("view_apply_service","viewApplyService","导出","1111110","viewApplyService");
	
	
	public OperationButton addT019Attch=new OperationButton("add_attch","addServiceAttch","上传附件","0000011","addServiceAttch");
	public OperationButton delT019Attch=new OperationButton("delete_attch","deleteServiceAttch","删除附件","0000011","deleteServiceAttch");
	
	public OperationButton AllEmpty=new  OperationButton("view_apply_service","viewApplyService","基本","0000001","viewApplyService");
	
	/**
	 * 工作台按钮信息
	 */
	public OperationButton viewOrAuditJob=new OperationButton("view_or_audit_job","viewOrAuditJob","查看工单","1111111","viewOrAuditJob");
	public OperationButton batchAuditJob=new OperationButton("batch_audit_job","batchAuditJob","批量审批","0001111","batchAuditJob");
	public OperationButton batchRejectJob=new OperationButton("batch_reject_job","batchRejectJob","批量退回","0001000","batchRejectJob");
	public OperationButton exportJobBySelected=new OperationButton("export_select_job","exportJobBySelected","导出所选工单","0101000","exportJobBySelected");
	public OperationButton exportJobByCondition=new OperationButton("export_condition_job","exportJobByCondition","导出符合条件工单","0101000","exportJobByCondition");
	public OperationButton deleteApplyService=new OperationButton("delete_apply_service","deleteApplyService","删除","1111110","deleteApplyService");
	/**
	 * 查询处理按钮
	 * @param itemId
	 * @param roleBit
	 * @return
	 */
    public List<OperationButton> queryOperationButton(String itemId,String roleBit);
}
