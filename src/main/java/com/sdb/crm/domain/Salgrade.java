package com.sdb.crm.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * salgrade
 * @author 
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