package com.zdd.risk.modular.system.dao;

import com.zdd.risk.common.persistence.model.UserItem;
import com.zdd.risk.common.persistence.model.UserItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserItemMapper {
    int countByExample(UserItemExample example);

    int deleteByExample(UserItemExample example);

    int deleteByPrimaryKey(String userid);

    int insert(UserItem record);

    int insertSelective(UserItem record);

    List<UserItem> selectByExampleWithBLOBs(UserItemExample example);

    List<UserItem> selectByExample(UserItemExample example);

    UserItem selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") UserItem record, @Param("example") UserItemExample example);

    int updateByExampleWithBLOBs(@Param("record") UserItem record, @Param("example") UserItemExample example);

    int updateByExample(@Param("record") UserItem record, @Param("example") UserItemExample example);

    int updateByPrimaryKeySelective(UserItem record);

    int updateByPrimaryKeyWithBLOBs(UserItem record);

    int updateByPrimaryKey(UserItem record);
}