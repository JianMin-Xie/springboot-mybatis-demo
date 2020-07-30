package com.xjm.springboot.mybatis.demo.mapper;

import com.xjm.springboot.mybatis.demo.domain.Bonus;

import java.util.List;

/**
@author JianMin Xie
@create 2020-07-29 17:28
*/
public interface BonusMapper {

    List<Bonus> selectAll();

    Bonus selectByEname(String ename);

    int insert(Bonus record);

    int delete(String ename);

    int update(Bonus bonus);

}