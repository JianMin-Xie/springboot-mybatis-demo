package com.xjm.springboot.mybatis.demo.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
@author JianMin Xie
@create 2020-07-29 11:00
*/
/**
    * 部门表
    */
@Data
public class Dept implements Serializable {
    /**
    * 部门编号
    */
    private Integer deptno;

    /**
    * 部门名称
    */
    private String dname;

    /**
    * 部门所在位置
    */
    private String loc;

    /**
     * 多个员工
     */
    private List<Emp> empList;

    private static final long serialVersionUID = 1L;
}