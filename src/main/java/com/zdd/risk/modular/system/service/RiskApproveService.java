package com.zdd.risk.modular.system.service;

import com.zdd.risk.common.persistence.model.RiskApprove;

import java.util.List;
import java.util.Map;

/**
 * Created by 孟庆合 on 2018/12/19.
 */
public interface RiskApproveService {
    //List<Map<String,Object>> selectAll();

    // List<Map<String,Object>> selectApprove(String name, String beginTime, String endTime, String typeName, String statusName, String telName, String idCard);
    List<RiskApprove> selectAll();
}
