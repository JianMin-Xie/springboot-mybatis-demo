package com.xjm.springboot.mybatis.demo.mapper;

import com.xjm.springboot.mybatis.demo.domain.Salgrade;

import java.util.List;

/**
@author JianMin Xie
@create 2020-07-29 14:36
*/
public interface SalgradeMapper {

    List<Salgrade> selectAll();

    Salgrade selectByGrade(int grade);

    int insert(Salgrade record);

    int delete(int grade);

    int update(Salgrade salgrade);

}