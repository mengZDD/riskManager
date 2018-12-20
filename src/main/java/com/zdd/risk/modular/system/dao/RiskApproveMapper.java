package com.zdd.risk.modular.system.dao;

import com.zdd.risk.common.persistence.model.RiskApprove;
import com.zdd.risk.common.persistence.model.RiskApproveExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface RiskApproveMapper {
    int countByExample(RiskApproveExample example);

    int deleteByExample(RiskApproveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RiskApprove record);

    int insertSelective(RiskApprove record);

    List<RiskApprove> selectByExample(RiskApproveExample example);

    RiskApprove selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RiskApprove record, @Param("example") RiskApproveExample example);

    int updateByExample(@Param("record") RiskApprove record, @Param("example") RiskApproveExample example);

    int updateByPrimaryKeySelective(RiskApprove record);

    int updateByPrimaryKey(RiskApprove record);

    @Select(value = "select * from risk_approve")
    List<RiskApprove> selectAll();
}