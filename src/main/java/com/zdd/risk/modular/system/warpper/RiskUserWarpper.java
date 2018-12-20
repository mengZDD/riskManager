package com.zdd.risk.modular.system.warpper;

import com.zdd.risk.common.constant.factory.ConstantFactory;
import com.zdd.risk.common.warpper.BaseControllerWarpper;

import java.util.Map;

/**
 * Created by 孟庆合 on 2018/12/20.
 */
public class RiskUserWarpper extends BaseControllerWarpper {
    public RiskUserWarpper(Object obj) {
        super(obj);
    }

    @Override
    protected void warpTheMap(Map<String, Object> map) {

        map.put("typeName", ConstantFactory.me().getPeopleName((Integer) map.get("type")));
        map.put("sourceName",ConstantFactory.me().getGuaranteeName((Integer) map.get("source")));
        map.put("accreditName",ConstantFactory.me().getAccreditName((Integer) map.get("source")));
        map.put("creditName",ConstantFactory.me().getCreditName((Integer) map.get("source")));

    }
}
