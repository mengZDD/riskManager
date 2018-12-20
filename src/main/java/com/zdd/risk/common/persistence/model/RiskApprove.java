package com.zdd.risk.common.persistence.model;

public class RiskApprove {
    private Integer id;

    private String orderid;

    private String idcardNo;

    private String username;

    private String tel;

    private Integer guidePrice;

    private Integer guarantee;

    private Integer totaldePosit;

    private Integer reductionRatio;

    private Integer creditCost;

    private Integer money;

    private Integer periods;

    private Integer status;

    private String updateTime;

    private String creatTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo == null ? null : idcardNo.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(Integer guidePrice) {
        this.guidePrice = guidePrice;
    }

    public Integer getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Integer guarantee) {
        this.guarantee = guarantee;
    }

    public Integer getTotaldePosit() {
        return totaldePosit;
    }

    public void setTotaldePosit(Integer totaldePosit) {
        this.totaldePosit = totaldePosit;
    }

    public Integer getReductionRatio() {
        return reductionRatio;
    }

    public void setReductionRatio(Integer reductionRatio) {
        this.reductionRatio = reductionRatio;
    }

    public Integer getCreditCost() {
        return creditCost;
    }

    public void setCreditCost(Integer creditCost) {
        this.creditCost = creditCost;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getPeriods() {
        return periods;
    }

    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime == null ? null : creatTime.trim();
    }
}