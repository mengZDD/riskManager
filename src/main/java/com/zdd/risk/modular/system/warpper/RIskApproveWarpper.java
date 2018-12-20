package com.zdd.risk.modular.system.warpper;

import com.zdd.risk.common.constant.factory.ConstantFactory;
import com.zdd.risk.common.warpper.BaseControllerWarpper;

import java.util.List;
import java.util.Map;

/**
 * Created by 孟庆合 on 2018/12/19.
 */
public class RIskApproveWarpper extends BaseControllerWarpper {
    public RIskApproveWarpper(List<Map<String, Object>> list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        map.put("guaranteeName", ConstantFactory.me().getGuaranteeName((Integer) map.get("guarantee")));
        map.put("statusName", ConstantFactory.me().getStatusShenName((Integer) map.get("status")));
    }
}
