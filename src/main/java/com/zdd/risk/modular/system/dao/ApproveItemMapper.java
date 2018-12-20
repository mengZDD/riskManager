package com.zdd.risk.modular.system.dao;

import com.zdd.risk.common.persistence.model.ApproveItem;
import com.zdd.risk.common.persistence.model.ApproveItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApproveItemMapper {
    int countByExample(ApproveItemExample example);

    int deleteByExample(ApproveItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApproveItem record);

    int insertSelective(ApproveItem record);

    List<ApproveItem> selectByExample(ApproveItemExample example);

    ApproveItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApproveItem record, @Param("example") ApproveItemExample example);

    int updateByExample(@Param("record") ApproveItem record, @Param("example") ApproveItemExample example);

    int updateByPrimaryKeySelective(ApproveItem record);

    int updateByPrimaryKey(ApproveItem record);
}