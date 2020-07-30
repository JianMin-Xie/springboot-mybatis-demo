package com.xjm.springboot.mybatis.demo.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
@author JianMin Xie
@create 2020-07-29 17:28
*/
/**
    * 工资表
    */
@Data
public class Bonus implements Serializable {
    /**
    * 雇员姓名
    */
    private String ename;

    /**
    * 雇员职位
    */
    private String job;

    /**
    * 雇员工资
    */
    private BigDecimal sal;

    /**
    * 雇员资金
    */
    private BigDecimal comm;

    private static final long serialVersionUID = 1L;
}