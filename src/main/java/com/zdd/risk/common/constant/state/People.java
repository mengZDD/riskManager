package com.zdd.risk.common.constant.state;

/**
 * Created by 孟庆合 on 2018/12/20.
 */
public enum People {

    Xue(1,"学生"),Gong(2,"工薪");

    private Integer code;
    private String des;

    People(Integer code, String des) {
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
            for (People rt : People.values()) {
                if (rt.getCode() == value) {
                    return rt.getDes();
                }
            }
            return "";
        }
    }
}
