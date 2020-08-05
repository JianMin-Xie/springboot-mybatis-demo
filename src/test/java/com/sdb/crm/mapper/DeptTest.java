package com.sdb.crm.mapper;
import com.sdb.crm.domain.Dept;
import com.sdb.crm.domain.DeptExample;
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
public class DeptTest {

    @Resource
    private DeptMapper deptMapper;

    /**
     * 查询全部记录
     */
    @Test
    public void selectAll() {
        DeptExample deptExample = new DeptExample();
        deptExample.createCriteria().getAllCriteria();
        List<Dept> depts = deptMapper.selectByExample(deptExample);
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
        } else {
            System.out.println(dept);
        }
    }

    /**
     * 查询
     */
    @Test
    public void select() {

        DeptExample deptExample = new DeptExample();
        deptExample.createCriteria().andDeptnoEqualTo(30);

        List<Dept> depts = deptMapper.selectByExample(deptExample);

        if (depts == null || depts.size() == 0) {
            System.out.println("表中不存在该数据！");
        } else {
            System.out.println(depts);
        }
    }

    /**
     * 关联查询： 查询雇佣日期加上10年大于输入日期的雇员信息以及部门名称
     * SELECT
     * a.*, b.dname
     * FROM
     * emp a
     * INNER JOIN dept b ON a.deptno = b.deptno
     * WHERE
     * DATE_ADD(hiredate, INTERVAL 10 YEAR) > STR_TO_DATE('01/10/1995', '%m/%d/%Y')
     * ORDER BY
     * hiredate DESC;
     */
    @Test
    public void AssociationQuery() {
        /**
         * 输入日期必须是  %m/%d/%Y 格式
         */
        List<Dept> depts = deptMapper.AssociationQuery("01/10/1995");
        if (depts == null || depts.size() == 0) {
            System.out.println("表中无数据！");
        } else {
            System.out.println(depts);
        }
    }

    /**
     * 插入 ， INSERT INTO dept VALUES (10,'ACCOUNTING','NEW YORK') ;
     */
    @Test
    public void insert() {
        Dept dept = new Dept();
        dept.setDeptno(10);
        dept.setDname("ACCOUNTING");
        dept.setLoc("NEW YORK");

        int insert = deptMapper.insertSelective(dept);
        if (insert > 0) {
            System.out.println("插入数据成功！");
        } else {
            System.out.println("插入失败！");
        }

    }


    /**
     * 根据主键删除
     */
    @Test
    public void deleteByPrimaryKey() {
        int i = deptMapper.deleteByPrimaryKey(41);
        if (i > 0) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败！");
        }
    }

    /**
     * 删除 , DELETE FROM dept WHERE dname = 'testDname1' AND loc = 'testLoc1';
     */
    @Test
    public void delete() {
        DeptExample deptExample = new DeptExample();
        deptExample.createCriteria().andDnameEqualTo("testDname1").andLocEqualTo("testLoc1");

        int i = deptMapper.deleteByExample(deptExample);

        if (i > 0) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败！");
        }
    }


    /**
     * 根据主键更新
     */
    @Test
    public void updateByPrimaryKey() {
        Dept dept = deptMapper.selectByPrimaryKey(30);
        dept.setDname("testDname1");
        dept.setLoc("testLoc1");

        int i = deptMapper.updateByPrimaryKey(dept);

        if (i > 0) {
            System.out.println("更新成功！");
        } else {
            System.out.println("更新失败！");
        }

    }

    /**
     * 更新
     */
    @Test
    public void update() {
        Dept dept = new Dept();
        dept.setDname("testDname222");
        dept.setLoc("testLoc222");

        DeptExample deptExample = new DeptExample();
        deptExample.createCriteria().andDeptnoEqualTo(30);
        int i = deptMapper.updateByExampleSelective(dept, deptExample);

        if (i > 0) {
            System.out.println("更新成功！");
        } else {
            System.out.println("更新失败！");
        }

    }
}