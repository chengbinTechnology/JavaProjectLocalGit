package com.newCloud.activity.po;
// default package

import java.sql.Timestamp;


/**
 * ActRuTask entity. @author MyEclipse Persistence Tools
 */

public class ActRuTask  implements java.io.Serializable {

    // Fields    

     private String id;
     private Integer rev;
     private String executionId;
     private String procInstId;
     private String procDefId;
     private String name;
     private String parentTaskId;
     private String description;
     private String taskDefKey;
     private String owner;
     private String assignee;
     private String delegation;
     private Integer priority;
     private Timestamp createTime;
     private Timestamp dueDate;
     private String category;
     private Integer suspensionState;
     private String tenantId;
     private String formKey;


    // Constructors

    /** default constructor */
    public ActRuTask() {
    }

    
    /** full constructor */
    public ActRuTask(Integer rev, String executionId, String procInstId, String procDefId, String name, String parentTaskId, String description, String taskDefKey, String owner, String assignee, String delegation, Integer priority, Timestamp createTime, Timestamp dueDate, String category, Integer suspensionState, String tenantId, String formKey) {
        this.rev = rev;
        this.executionId = executionId;
        this.procInstId = procInstId;
        this.procDefId = procDefId;
        this.name = name;
        this.parentTaskId = parentTaskId;
        this.description = description;
        this.taskDefKey = taskDefKey;
        this.owner = owner;
        this.assignee = assignee;
        this.delegation = delegation;
        this.priority = priority;
        this.createTime = createTime;
        this.dueDate = dueDate;
        this.category = category;
        this.suspensionState = suspensionState;
        this.tenantId = tenantId;
        this.formKey = formKey;
    }

   
    // Property accessors

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public Integer getRev() {
        return this.rev;
    }
    
    public void setRev(Integer rev) {
        this.rev = rev;
    }

    public String getExecutionId() {
        return this.executionId;
    }
    
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getProcInstId() {
        return this.procInstId;
    }
    
    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    public String getProcDefId() {
        return this.procDefId;
    }
    
    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getParentTaskId() {
        return this.parentTaskId;
    }
    
    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTaskDefKey() {
        return this.taskDefKey;
    }
    
    public void setTaskDefKey(String taskDefKey) {
        this.taskDefKey = taskDefKey;
    }

    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAssignee() {
        return this.assignee;
    }
    
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getDelegation() {
        return this.delegation;
    }
    
    public void setDelegation(String delegation) {
        this.delegation = delegation;
    }

    public Integer getPriority() {
        return this.priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getDueDate() {
        return this.dueDate;
    }
    
    public void setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate;
    }

    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getSuspensionState() {
        return this.suspensionState;
    }
    
    public void setSuspensionState(Integer suspensionState) {
        this.suspensionState = suspensionState;
    }

    public String getTenantId() {
        return this.tenantId;
    }
    
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getFormKey() {
        return this.formKey;
    }
    
    public void setFormKey(String formKey) {
        this.formKey = formKey;
    }
   








}