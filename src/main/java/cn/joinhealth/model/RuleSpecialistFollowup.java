package cn.joinhealth.model;

import java.math.BigDecimal;
import java.util.Date;

public class RuleSpecialistFollowup {
    private String id;

    private Integer dataType;  //数据类型(1,基础库 2,医院库)

    private String hospCode;  //医院编码

    private String ruleId;  //规则ID

    private BigDecimal ruleVersion;  //规则版本

    private String ruleVersionDesc;  //规则版本描述

    private String ruleTitle;  //规则标题

    private String ruleDesc;  //规则描述/应用场景说明

    private String labelCodes;  //关联标签代码(逗号分隔，上限10个)

    private String labelNames;  //关联标签名称

    private String diagCodes;  //关联疾病代码(逗号分隔，上限10个)

    private String diagNames;  //关联疾病名称

    private String ruleFormId;  //规则内所有表单ID，逗号分隔

    private String ruleEducationId;  //规则内所有宣教ID，逗号分隔

    private String editorId;  //编辑人ID

    private String editorName;  //编辑人姓名

    private Date createTime;  //创建时间

    private Date updateTime;  //更新时间

    private Integer isDelete;  //删除标识，0：未删除，1：已删除

    private String ruleJson;  //专科随访规则完整json串

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getHospCode() {
        return hospCode;
    }

    public void setHospCode(String hospCode) {
        this.hospCode = hospCode == null ? null : hospCode.trim();
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    public BigDecimal getRuleVersion() {
        return ruleVersion;
    }

    public void setRuleVersion(BigDecimal ruleVersion) {
        this.ruleVersion = ruleVersion;
    }

    public String getRuleVersionDesc() {
        return ruleVersionDesc;
    }

    public void setRuleVersionDesc(String ruleVersionDesc) {
        this.ruleVersionDesc = ruleVersionDesc == null ? null : ruleVersionDesc.trim();
    }

    public String getRuleTitle() {
        return ruleTitle;
    }

    public void setRuleTitle(String ruleTitle) {
        this.ruleTitle = ruleTitle == null ? null : ruleTitle.trim();
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc == null ? null : ruleDesc.trim();
    }

    public String getLabelCodes() {
        return labelCodes;
    }

    public void setLabelCodes(String labelCodes) {
        this.labelCodes = labelCodes == null ? null : labelCodes.trim();
    }

    public String getLabelNames() {
        return labelNames;
    }

    public void setLabelNames(String labelNames) {
        this.labelNames = labelNames == null ? null : labelNames.trim();
    }

    public String getDiagCodes() {
        return diagCodes;
    }

    public void setDiagCodes(String diagCodes) {
        this.diagCodes = diagCodes == null ? null : diagCodes.trim();
    }

    public String getDiagNames() {
        return diagNames;
    }

    public void setDiagNames(String diagNames) {
        this.diagNames = diagNames == null ? null : diagNames.trim();
    }

    public String getRuleFormId() {
        return ruleFormId;
    }

    public void setRuleFormId(String ruleFormId) {
        this.ruleFormId = ruleFormId == null ? null : ruleFormId.trim();
    }

    public String getRuleEducationId() {
        return ruleEducationId;
    }

    public void setRuleEducationId(String ruleEducationId) {
        this.ruleEducationId = ruleEducationId == null ? null : ruleEducationId.trim();
    }

    public String getEditorId() {
        return editorId;
    }

    public void setEditorId(String editorId) {
        this.editorId = editorId == null ? null : editorId.trim();
    }

    public String getEditorName() {
        return editorName;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName == null ? null : editorName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getRuleJson() {
        return ruleJson;
    }

    public void setRuleJson(String ruleJson) {
        this.ruleJson = ruleJson == null ? null : ruleJson.trim();
    }
}