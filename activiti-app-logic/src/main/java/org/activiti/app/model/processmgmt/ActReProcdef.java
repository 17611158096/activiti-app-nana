package org.activiti.app.model.processmgmt;

import java.io.Serializable;
import org.joda.time.DateTime;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * activiti-已部署的流程定义(ActReProcdef)实体类
 *
 * @author nana
 * @since 2019-04-29 14:20:46
 */
@TableName(value="act_re_procdef")
public class ActReProcdef implements Serializable {
    private static final long serialVersionUID = -12794709280528170L;
   
    /**
     * 流程ID，由“流程编号：流程版本号：自增ID组成” 
     */
     @TableField(value="ID_")
    private String id_;
   
    /**
     * 版本号 
     */
     @TableField(value="REV_")
    private Integer rev_;
   
    /**
     * 流程命名空间（该编号就是流程文件targetNamespace的属性值） 
     */
     @TableField(value="CATEGORY_")
    private String category_;
   
    /**
     * 流程名称（该编号就是流程文件process元素的name属性值） 
     */
     @TableField(value="NAME_")
    private String name_;
   
    /**
     * 流程编号（该编号就是流程文件process元素的id属性值） 
     */
     @TableField(value="KEY_")
    private String key_;
   
    /**
     * 流程版本号（由程序控制，新增即为1，修改后依次加1来完成的） 
     */
     @TableField(value="VERSION_")
    private Integer version_;
   
    /**
     * 部署编号 
     */
     @TableField(value="DEPLOYMENT_ID_")
    private String deploymentId_;
   
    /**
     * 资源文件名称	 
     */
     @TableField(value="RESOURCE_NAME_")
    private String resourceName_;
   
    /**
     * 图片资源文件名称 
     */
     @TableField(value="DGRM_RESOURCE_NAME_")
    private String dgrmResourceName_;
   
    /**
     * 描述信息 
     */
     @TableField(value="DESCRIPTION_")
    private String description_;
   
    /**
     * 是否从key启动 
     */
     @TableField(value="HAS_START_FORM_KEY_")
    private int hasStartFormKey_;
   
    /**
     *  
     */
     @TableField(value="HAS_GRAPHICAL_NOTATION_")
    private int hasGraphicalNotation_;
   
    /**
     * 是否挂起 
     */
     @TableField(value="SUSPENSION_STATE_")
    private Integer suspensionState_;
   
    /**
     *  
     */
     @TableField(value="TENANT_ID_")
    private String tenantId_;
   
    /**
     *  
     */
     @TableField(value="ENGINE_VERSION_")
    private String engineVersion_;

    public ActReProcdef(String id_ , Integer rev_ , String category_ , String name_ , String key_ , Integer version_ , String deploymentId_ , String resourceName_ , String dgrmResourceName_ , String description_ , int hasStartFormKey_ , int hasGraphicalNotation_ , Integer suspensionState_ , String tenantId_ , String engineVersion_ ){
        this.id_=id_; 
        this.rev_=rev_; 
        this.category_=category_; 
        this.name_=name_; 
        this.key_=key_; 
        this.version_=version_; 
        this.deploymentId_=deploymentId_; 
        this.resourceName_=resourceName_; 
        this.dgrmResourceName_=dgrmResourceName_; 
        this.description_=description_; 
        this.hasStartFormKey_=hasStartFormKey_; 
        this.hasGraphicalNotation_=hasGraphicalNotation_; 
        this.suspensionState_=suspensionState_; 
        this.tenantId_=tenantId_; 
        this.engineVersion_=engineVersion_; 
    }
  
    public ActReProcdef(){}

    
     public String getId_() {
         return id_;
    }
    
    public void setId_(String id_) {
        this.id_ = id_;
    }
    
     public Integer getRev_() {
         return rev_;
    }
    
    public void setRev_(Integer rev_) {
        this.rev_ = rev_;
    }
    
     public String getCategory_() {
         return category_;
    }
    
    public void setCategory_(String category_) {
        this.category_ = category_;
    }
    
     public String getName_() {
         return name_;
    }
    
    public void setName_(String name_) {
        this.name_ = name_;
    }
    
     public String getKey_() {
         return key_;
    }
    
    public void setKey_(String key_) {
        this.key_ = key_;
    }
    
     public Integer getVersion_() {
         return version_;
    }
    
    public void setVersion_(Integer version_) {
        this.version_ = version_;
    }
    
     public String getDeploymentId_() {
         return deploymentId_;
    }
    
    public void setDeploymentId_(String deploymentId_) {
        this.deploymentId_ = deploymentId_;
    }
    
     public String getResourceName_() {
         return resourceName_;
    }
    
    public void setResourceName_(String resourceName_) {
        this.resourceName_ = resourceName_;
    }
    
     public String getDgrmResourceName_() {
         return dgrmResourceName_;
    }
    
    public void setDgrmResourceName_(String dgrmResourceName_) {
        this.dgrmResourceName_ = dgrmResourceName_;
    }
    
     public String getDescription_() {
         return description_;
    }
    
    public void setDescription_(String description_) {
        this.description_ = description_;
    }
    
     public int getHasStartFormKey_() {
         return hasStartFormKey_;
    }
    
    public void setHasStartFormKey_(int hasStartFormKey_) {
        this.hasStartFormKey_ = hasStartFormKey_;
    }
    
     public int getHasGraphicalNotation_() {
         return hasGraphicalNotation_;
    }
    
    public void setHasGraphicalNotation_(int hasGraphicalNotation_) {
        this.hasGraphicalNotation_ = hasGraphicalNotation_;
    }
    
     public Integer getSuspensionState_() {
         return suspensionState_;
    }
    
    public void setSuspensionState_(Integer suspensionState_) {
        this.suspensionState_ = suspensionState_;
    }
    
     public String getTenantId_() {
         return tenantId_;
    }
    
    public void setTenantId_(String tenantId_) {
        this.tenantId_ = tenantId_;
    }
    
     public String getEngineVersion_() {
         return engineVersion_;
    }
    
    public void setEngineVersion_(String engineVersion_) {
        this.engineVersion_ = engineVersion_;
    }

}