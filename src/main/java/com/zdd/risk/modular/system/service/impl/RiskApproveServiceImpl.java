package com.zdd.risk.modular.system.service.impl;

import com.zdd.risk.common.persistence.model.RiskApprove;
import com.zdd.risk.modular.system.dao.RiskApproveMapper;
import com.zdd.risk.modular.system.service.RiskApproveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 孟庆合 on 2018/12/19.
 */
@Service
public class RiskApproveServiceImpl implements RiskApproveService{

    @Autowired
    private RiskApproveMapper riskApproveMapper;

    /*public List<Map<String, Object>> selectAll() {

       List<Map<String,Object>> mapList= riskApproveMapper.selectAll();
        return mapList;
    }*/

    @Override
    public List<RiskApprove> selectAll() {
        List<RiskApprove> riskApproves = riskApproveMapper.selectAll();
        return riskApproves;
    }

/*
    @Autowired
    //private RiskApproveMapper riskApproveMapper;

    @Override
    *//*public List<Map<String, Object>> selectApprove(String name, String beginTime, String endTime, String typeName, String statusName, String telName, String idCard) {

        if(!StringUtils.isEmpty(typeName)){
            if("芝麻信用".equals(typeName)){
                typeName="1";
            }
            if("信用卡".equals(typeName)){
                typeName="2";
            }
            if("闯意贷花呗".equals(typeName)){
                typeName="3";
            }
            if("东东信用".equals(typeName)){
                typeName="5";
            }
        }
        if(!StringUtils.isEmpty(statusName)){

            if("待审核".equals(statusName)){
                statusName="1";
            }
            if("审核中".equals(statusName)){
                statusName="2";
            }
            if("已拒绝".equals(statusName)){
                statusName="3";
            }
            if("已通过".equals(statusName)){
                statusName="4";
            }
        }*//*
        //List<Map<String,Object>> list=riskApproveMapper.selectApprove(name,beginTime,endTime,typeName,statusName,telName,idCard);
        return null;
    }*/
}
