package com.zdd.risk.common.utils;

import com.zdd.risk.common.constant.factory.ConstantFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by 孟庆合 on 2018/12/20.
 */
public class WarpperBasic {

    public Object obj = null;

    public WarpperBasic(Object obj) {
        this.obj = obj;
    }

    @SuppressWarnings("unchecked")
    public Object warp() {
        if (this.obj instanceof List) {
            List<Map<String, Object>> list = (List<Map<String, Object>>) this.obj;
            for (Map<String, Object> map : list) {
                warpTheMap(map);
            }
            return list;
        } else if (this.obj instanceof Map) {
            Map<String, Object> map = (Map<String, Object>) this.obj;
            warpTheMap(map);
            return map;
        } else {
            return this.obj;
        }
    }
    public void warpTheMap(Map<String, Object> map){
        map.put("typeName", ConstantFactory.me().getPeopleName((Integer) map.get("type")));
        map.put("sourceName",ConstantFactory.me().getGuaranteeName((Integer) map.get("source")));
        map.put("accreditName",ConstantFactory.me().getAccreditName((Integer) map.get("source")));
        map.put("creditName",ConstantFactory.me().getCreditName((Integer) map.get("source")));
    }
}
