package com.zdd.risk.modular.system.dao;

import com.zdd.risk.common.persistence.model.RiskOrder;
import com.zdd.risk.common.persistence.model.RiskOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskOrderMapper {
    int countByExample(RiskOrderExample example);

    int deleteByExample(RiskOrderExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(RiskOrder record);

    int insertSelective(RiskOrder record);

    List<RiskOrder> selectByExampleWithBLOBs(RiskOrderExample example);

    List<RiskOrder> selectByExample(RiskOrderExample example);

    RiskOrder selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") RiskOrder record, @Param("example") RiskOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") RiskOrder record, @Param("example") RiskOrderExample example);

    int updateByExample(@Param("record") RiskOrder record, @Param("example") RiskOrderExample example);

    int updateByPrimaryKeySelective(RiskOrder record);

    int updateByPrimaryKeyWithBLOBs(RiskOrder record);

    int updateByPrimaryKey(RiskOrder record);
}