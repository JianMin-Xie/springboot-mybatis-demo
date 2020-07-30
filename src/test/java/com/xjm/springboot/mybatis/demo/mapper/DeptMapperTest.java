package com.xjm.springboot.mybatis.demo.mapper;

import com.xjm.springboot.mybatis.demo.domain.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 对 dept 表进行 CRUD 操作
 *
 * @author JianMin Xie
 * @create 2020-07-29 11:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DeptMapperTest {

    @Resource
    private DeptMapper deptMapper;


    /**
     * 查询全部记录
     */
    @Test
    public void selectAll() {
        List<Dept> depts = deptMapper.selectAll();
        if (depts == null || depts.size() == 0) {
            System.out.println("表中无数据！");
        } else {
            System.out.println(depts);
        }
    }

    /**
     * 根据主键查询单挑记录
     */
    @Test
    public void selectByPrimaryKey() {
        Dept dept = deptMapper.selectByPrimaryKey(30);
        if (dept == null || dept.equals("")) {
            System.out.println("表中不存在该数据！");
        }
        else {
            System.out.println(dept);
        }
    }

    /**
     * 关联查询：
     * SELECT
     * 	a.*, b.dname
     * FROM
     * 	emp a
     * INNER JOIN dept b ON a.deptno = b.deptno
     * WHERE
     * 	DATE_ADD(hiredate, INTERVAL 10 YEAR) > STR_TO_DATE('01/10/1995', '%m/%d/%Y')
     * ORDER BY
     * 	hiredate DESC;
     */
    @Test
    public void AssociationQuery(){
        List<Dept> depts = deptMapper.AssociationQuery();
        if (depts == null || depts.size() == 0) {
            System.out.println("表中无数据！");
        } else {
            System.out.println(depts);
        }
    }

    /**
     * 插入 ， INSERT INTO dept VALUES (10,'ACCOUNTING','NEW YORK') ;
     *
     */
    @Test
    public void insert() {
        Dept dept = new Dept();
        dept.setDeptno(10);
        dept.setDname("ACCOUNTING");
        dept.setLoc("NEW YORK");

        int insert = deptMapper.insert(dept);
        if (insert > 0) {
            System.out.println("插入数据成功！");
        }
        else {
            System.out.println("插入失败！");
        }

    }


    /**
     * 删除
     */
    @Test
    public void deleteByPrimaryKey() {
        int i = deptMapper.deleteByPrimaryKey(42);
        if (i > 0) {
            System.out.println("删除成功！");
        }
        else {
            System.out.println("删除失败！");
        }
    }


    /**
     * 更新
     */
    @Test
    public void updateByPrimaryKey() {
        Dept dept = deptMapper.selectByPrimaryKey(30);

        dept.setDname("testupdateDname1");
        dept.setLoc("testupdateLoc1");

        int i = deptMapper.updateByPrimaryKey(dept);

        if (i > 0) {
            System.out.println("更新成功！");
        }
        else {
            System.out.println("更新失败！");
        }

    }
}