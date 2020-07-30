package com.xjm.springboot.mybatis.demo.mapper;

import com.xjm.springboot.mybatis.demo.domain.Dept;

import java.util.List;

/**
@author JianMin Xie
@create 2020-07-29 11:00
*/
public interface DeptMapper {
    List<Dept> selectAll();

    Dept selectByPrimaryKey(Integer deptno);

    int insert(Dept record);

    int deleteByPrimaryKey(Integer deptno);

    int updateByPrimaryKey(Dept record);
}