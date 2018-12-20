package com.zdd.risk.modular.system.dao;

import com.zdd.risk.common.persistence.model.RiskUser;
import com.zdd.risk.common.persistence.model.RiskUserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface RiskUserMapper {
    int countByExample(RiskUserExample example);

    int deleteByExample(RiskUserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(RiskUser record);

    int insertSelective(RiskUser record);

    List<RiskUser> selectByExample(RiskUserExample example);

    RiskUser selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") RiskUser record, @Param("example") RiskUserExample example);

    int updateByExample(@Param("record") RiskUser record, @Param("example") RiskUserExample example);

    int updateByPrimaryKeySelective(RiskUser record);

    int updateByPrimaryKey(RiskUser record);

   // @Select(value = "select * from risk_user")
    List<Map<String,Object>> selectAll();
}