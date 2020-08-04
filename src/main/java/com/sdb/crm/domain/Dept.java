package com.sdb.crm.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * dept
 * @author 
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

    private List<Emp> empList;

    private static final long serialVersionUID = 1L;


}