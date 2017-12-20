package com.wss.Do;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName:
 * @desc:
 * @author: jintao
 * @date: 2017-12-20 下午4:42
 **/
public class FinanceLogDo {
    private Long id;
    private String proofId;
    private Long accountId;
    private Long oppositeAccountId = 0L;
    private Long operationRelation;
    private Long userId;
    private Long roleId;
    private Long ownerId;
    private BigDecimal amount = BigDecimal.ZERO;
    private BigDecimal income = BigDecimal.ZERO;
    private BigDecimal expend = BigDecimal.ZERO;
    private BigDecimal balance = BigDecimal.ZERO;
    private BigDecimal locking = BigDecimal.ZERO;
    private String remark;
    private int createYear;
    private int createMonth;
    private String tableName;
    private String keyValue;


    private int isDelete;

    private Date createTime;

    private Date updateTime;

    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProofId() {
        return proofId;
    }

    public void setProofId(String proofId) {
        this.proofId = proofId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getOppositeAccountId() {
        return oppositeAccountId;
    }

    public void setOppositeAccountId(Long oppositeAccountId) {
        this.oppositeAccountId = oppositeAccountId;
    }

    public Long getOperationRelation() {
        return operationRelation;
    }

    public void setOperationRelation(Long operationRelation) {
        this.operationRelation = operationRelation;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal getExpend() {
        return expend;
    }

    public void setExpend(BigDecimal expend) {
        this.expend = expend;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLocking() {
        return locking;
    }

    public void setLocking(BigDecimal locking) {
        this.locking = locking;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public int getCreateMonth() {
        return createMonth;
    }

    public void setCreateMonth(int createMonth) {
        this.createMonth = createMonth;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FinanceLogDo{");
        sb.append("id=").append(id);
        sb.append(", proofId='").append(proofId).append('\'');
        sb.append(", accountId=").append(accountId);
        sb.append(", oppositeAccountId=").append(oppositeAccountId);
        sb.append(", operationRelation=").append(operationRelation);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", amount=").append(amount);
        sb.append(", income=").append(income);
        sb.append(", expend=").append(expend);
        sb.append(", balance=").append(balance);
        sb.append(", locking=").append(locking);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", createYear=").append(createYear);
        sb.append(", createMonth=").append(createMonth);
        sb.append(", tableName='").append(tableName).append('\'');
        sb.append(", keyValue='").append(keyValue).append('\'');
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", version=").append(version);
        sb.append('}');
        return sb.toString();
    }
}
