package com.sdb.crm.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * bonus
 * @author 
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