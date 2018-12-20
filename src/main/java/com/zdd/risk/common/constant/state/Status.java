package com.zdd.risk.common.constant.state;

/**
 * Created by 孟庆合 on 2018/12/19.
 */
public enum Status {

    Dai(1,"待审核"),Zhong(2,"审核中"),Ju(3,"已拒绝"),Guo(4,"已通过");
    private Integer code;
    private String des;

    Status(Integer code, String des) {
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
            for (Status rt : Status.values()) {
                if (rt.getCode() == value) {
                    return rt.getDes();
                }
            }
            return "";
        }
    }
}
