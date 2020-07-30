package com.xjm.springboot.mybatis.demo.mapper;

import com.xjm.springboot.mybatis.demo.domain.Salgrade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 对 salgrade 表进行 CRUD 操作
 * @author JianMin Xie
 * @create 2020-07-29 15:37
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SalgradeMapperTest {

    @Resource
    private SalgradeMapper salgradeMapper;

    /**
     * 查询全部
     */
    @Test
    public void selectAll() {
        List<Salgrade> salgrades = salgradeMapper.selectAll();
        if(salgrades == null || salgrades.size() == 0){
            System.out.println("表中无数据！");
        }
        else {
            System.out.println(salgrades);
        }
    }

    /**
     * 根据 grade 查询单挑记录
     */
    @Test
    public void selectByGrade() {
        Salgrade salgrade = salgradeMapper.selectByGrade(5);
        if(salgrade == null || salgrade.equals("")){
            System.out.println("表中不存在该数据！");
        }
        else {
            System.out.println(salgrade);
        }
    }

    /**
     * 插入
     */
    @Test
    public void insert() {
        Salgrade salgrade = new Salgrade();
        salgrade.setGrade(6);
        salgrade.setLosal(4000);
        salgrade.setHisal(11000);

        int insert = salgradeMapper.insert(salgrade);
        if (insert > 0){
            System.out.println("插入成功！");
        }
        else {
            System.out.println("插入失败！");
        }
    }


    /**
     * 根据 grade 删除单个数据
     */
    @Test
    public void delete(){
        int delete = salgradeMapper.delete(6);
        if (delete > 0){
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
    public void update(){
        Salgrade salgrade = salgradeMapper.selectByGrade(5);
        salgrade.setLosal(3000);
        salgrade.setHisal(10000);

        int update = salgradeMapper.update(salgrade);
        if (update > 0){
            System.out.println("更新成功！");
        }
        else {
            System.out.println("更新失败！");
        }
    }
}