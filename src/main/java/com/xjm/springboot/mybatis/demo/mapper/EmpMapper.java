package com.xjm.springboot.mybatis.demo.mapper;

import com.xjm.springboot.mybatis.demo.domain.Emp;

import java.util.List;

/**
@author JianMin Xie
@create 2020-07-29 14:35
*/
public interface EmpMapper {

    List<Emp> selectAll();

    Emp selectByPrimaryKey(Integer empno);

    int insert(Emp record);

    int deleteByPrimaryKey(Integer empno);

    int updateByPrimaryKey(Emp record);


}