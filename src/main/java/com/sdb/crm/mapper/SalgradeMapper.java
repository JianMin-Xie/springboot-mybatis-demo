package com.sdb.crm.mapper;

import com.sdb.crm.domain.Salgrade;
import com.sdb.crm.domain.SalgradeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalgradeMapper {
    long countByExample(SalgradeExample example);

    int deleteByExample(SalgradeExample example);

    int insert(Salgrade record);

    int insertSelective(Salgrade record);

    List<Salgrade> selectByExample(SalgradeExample example);

    int updateByExampleSelective(@Param("record") Salgrade record, @Param("example") SalgradeExample example);

    int updateByExample(@Param("record") Salgrade record, @Param("example") SalgradeExample example);
}