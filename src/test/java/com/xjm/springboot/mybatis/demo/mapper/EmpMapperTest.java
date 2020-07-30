package com.xjm.springboot.mybatis.demo.mapper;

import com.xjm.springboot.mybatis.demo.domain.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 对 emp 表进行 CRUD 操作
 * @author JianMin Xie
 * @create 2020-07-29 14:40
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class EmpMapperTest {

    @Resource
    private EmpMapper empMapper;


    /**
     * 查询全部
     */
    @Test
    public void selectAll() {
        List<Emp> emps = empMapper.selectAll();
        if(emps == null || emps.size() == 0){
            System.out.println("表中无数据！");
        }
        else {
            System.out.println(emps);
        }
    }

    /**
     * 根据主键查询单条记录
     */
    @Test
    public void selectByPrimaryKey() {
        Emp emp = empMapper.selectByPrimaryKey(7369);
        if(emp == null || emp.equals("")){
            System.out.println("表中不存在该数据！");
        }
        else {
            System.out.println(emp);
        }
    }


    /**
     * 插入
     */
    @Test
    public void insert() {
        Emp emp = new Emp();
        emp.setEname("Kobe Bryant");
        emp.setJob("NBA player");
        emp.setMgr(7566);
        emp.setHiredate(new Date());
        emp.setSal(new BigDecimal("5000"));
        emp.setComm(new BigDecimal("0"));
        emp.setDeptno(50);

        int insert = empMapper.insert(emp);

        if (insert > 0){
            System.out.println("插入成功！");
        }
        else {
            System.out.println("插入失败！");
        }
    }


    /**
     * 删除：DELETE FROM emp WHERE empno = 7934;
     */
    @Test
    public void deleteByPrimaryKey() {
        int i = empMapper.deleteByPrimaryKey(7934);
        if (i > 0){
            System.out.println("删除成功！");
        }
        else {
            System.out.println("删除失败！");
        }
    }

    /**
     * 更新：UPDATE emp SET job='MANAGER' WHERE  empno = 7369;
     */
    @Test
    public void updateByPrimaryKey() {
        Emp emp = empMapper.selectByPrimaryKey(7369);
//        emp.setEname("testupdateEanme1");
        emp.setJob("MANAGER");
//        emp.setMgr(7902);
//        emp.setHiredate(new Date());
//        emp.setSal(new BigDecimal("1000"));
//        emp.setComm(new BigDecimal("0"));
//        emp.setDeptno(20);

        int i = empMapper.updateByPrimaryKey(emp);
        if (i>0){
            System.out.println("更新成功！");
        }
        else {
            System.out.println("更新失败！");
        }
    }

}