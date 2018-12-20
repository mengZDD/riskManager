package com.zdd.risk.modular.system.dao;

import com.zdd.risk.common.persistence.model.RiskAddress;
import com.zdd.risk.common.persistence.model.RiskAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskAddressMapper {
    int countByExample(RiskAddressExample example);

    int deleteByExample(RiskAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RiskAddress record);

    int insertSelective(RiskAddress record);

    List<RiskAddress> selectByExample(RiskAddressExample example);

    RiskAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RiskAddress record, @Param("example") RiskAddressExample example);

    int updateByExample(@Param("record") RiskAddress record, @Param("example") RiskAddressExample example);

    int updateByPrimaryKeySelective(RiskAddress record);

    int updateByPrimaryKey(RiskAddress record);
}