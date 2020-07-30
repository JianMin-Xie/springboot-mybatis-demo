package com.xjm.springboot.mybatis.demo.domain;

import java.io.Serializable;
import lombok.Data;

/**
@author JianMin Xie
@create 2020-07-29 14:36
*/
/**
    * 工资等级表
    */
@Data
public class Salgrade implements Serializable {
    /**
    * 工资等级
    */
    private Integer grade;

    /**
    * 此等级的最低工资
    */
    private Integer losal;

    /**
    * 此等级的最高工资
    */
    private Integer hisal;

    private static final long serialVersionUID = 1L;
}