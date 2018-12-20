package com.zdd.risk.common.constant.state;

/**
 * Created by 孟庆合 on 2018/12/19.
 */
public enum Guarantee {

    Zhi(1,"芝麻信用"),Xin(2,"信用卡"),Chang(3,"闯意贷花呗"),Dong(4,"东东信用");

    private Integer code;
    private String des;
    Guarantee(Integer code, String des) {
        this.code = code;
        this.des = des;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    public static String valueOf(Integer value) {
        if (value == null) {
            return "";
        } else {
            for (Guarantee rt : Guarantee.values()) {
                if (rt.getCode() == value) {
                    return rt.getDes();
                }
            }
            return "";
        }
    }
}
