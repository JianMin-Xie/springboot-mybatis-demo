package com.sdb.crm.mapper;

import com.sdb.crm.domain.Bonus;
import com.sdb.crm.domain.BonusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BonusMapper {
    long countByExample(BonusExample example);

    int deleteByExample(BonusExample example);

    int insert(Bonus record);

    int insertSelective(Bonus record);

    List<Bonus> selectByExample(BonusExample example);

    int updateByExampleSelective(@Param("record") Bonus record, @Param("example") BonusExample example);

    int updateByExample(@Param("record") Bonus record, @Param("example") BonusExample example);
}