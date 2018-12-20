package com.zdd.risk.common.persistence.model;

public class RiskOrder {
    private Integer cid;

    private String orderid;

    private String userid;

    private String username;

    private String tel;

    private Integer months;

    private Integer money;

    private String brand;

    private String model;

    private Integer type;

    private String productName;

    private Integer market;

    private Integer deposit;

    private Integer premium;

    private Integer freeRatio;

    private Integer surplusRatio;

    private Integer guarantee;

    private Integer periodCost;

    private Byte periods;

    private Byte leftPeriods;

    private Integer buyoutCost;

    private Integer creditCost;

    private Integer periods2;

    private Integer periodCost2;

    private Integer buyoutCost2;

    private String creattime;

    private String address;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
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

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getMarket() {
        return market;
    }

    public void setMarket(Integer market) {
        this.market = market;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getPremium() {
        return premium;
    }

    public void setPremium(Integer premium) {
        this.premium = premium;
    }

    public Integer getFreeRatio() {
        return freeRatio;
    }

    public void setFreeRatio(Integer freeRatio) {
        this.freeRatio = freeRatio;
    }

    public Integer getSurplusRatio() {
        return surplusRatio;
    }

    public void setSurplusRatio(Integer surplusRatio) {
        this.surplusRatio = surplusRatio;
    }

    public Integer getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Integer guarantee) {
        this.guarantee = guarantee;
    }

    public Integer getPeriodCost() {
        return periodCost;
    }

    public void setPeriodCost(Integer periodCost) {
        this.periodCost = periodCost;
    }

    public Byte getPeriods() {
        return periods;
    }

    public void setPeriods(Byte periods) {
        this.periods = periods;
    }

    public Byte getLeftPeriods() {
        return leftPeriods;
    }

    public void setLeftPeriods(Byte leftPeriods) {
        this.leftPeriods = leftPeriods;
    }

    public Integer getBuyoutCost() {
        return buyoutCost;
    }

    public void setBuyoutCost(Integer buyoutCost) {
        this.buyoutCost = buyoutCost;
    }

    public Integer getCreditCost() {
        return creditCost;
    }

    public void setCreditCost(Integer creditCost) {
        this.creditCost = creditCost;
    }

    public Integer getPeriods2() {
        return periods2;
    }

    public void setPeriods2(Integer periods2) {
        this.periods2 = periods2;
    }

    public Integer getPeriodCost2() {
        return periodCost2;
    }

    public void setPeriodCost2(Integer periodCost2) {
        this.periodCost2 = periodCost2;
    }

    public Integer getBuyoutCost2() {
        return buyoutCost2;
    }

    public void setBuyoutCost2(Integer buyoutCost2) {
        this.buyoutCost2 = buyoutCost2;
    }

    public String getCreattime() {
        return creattime;
    }

    public void setCreattime(String creattime) {
        this.creattime = creattime == null ? null : creattime.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}