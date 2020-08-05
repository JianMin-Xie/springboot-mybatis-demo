package com.sdb.crm.mapper;

import com.sdb.crm.domain.Bonus;
import com.sdb.crm.domain.BonusExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author JianMin Xie
 * @create 2020-07-29 17:49
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BonusTest {

    @Resource
    private BonusMapper bonusMapper;

    /**
     * 查询全部
     */
    @Test
    public void selectAll() {
        BonusExample bonusExample = new BonusExample();
        bonusExample.createCriteria().getAllCriteria();
        List<Bonus> bonuses = bonusMapper.selectByExample(bonusExample);
        if (bonuses == null || bonuses.size() == 0) {
                System.out.println("表中无数据！");
            } else {
                System.out.println(bonuses);
            }
    }

    /**
     * 根据 ename 查询单挑记录
     */
    @Test
    public void selectByEname() {
        BonusExample bonusExample = new BonusExample();
        bonusExample.createCriteria().andEnameEqualTo("testname1");
        List<Bonus> bonuses = bonusMapper.selectByExample(bonusExample);
        if (bonuses == null || bonuses.size() == 0) {
            System.out.println("表中无数据！");
        } else {
            System.out.println(bonuses);
        }
    }

    /**
     * 插入
     */
    @Test
    public void insert() {
        Bonus bonus = new Bonus();
        bonus.setEname("testname1");
        bonus.setJob("testjob1");
        bonus.setSal(new BigDecimal("2000"));
        bonus.setComm(new BigDecimal("500"));

        int insert = bonusMapper.insert(bonus);
        if (insert > 0) {
            System.out.println("插入成功！");
        } else {
            System.out.println("插入失败！");
        }
    }

    /**
     * 删除
     */
    @Test
    public void deleteByEname() {
        BonusExample bonusExample = new BonusExample();
        bonusExample.createCriteria().andEnameEqualTo("testname1");
        int result = bonusMapper.deleteByExample(bonusExample);
        if (result > 0) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败！");
        }
    }

    /**
     * 更新
     */
    @Test
    public void update() {
        Bonus bonus = new Bonus();
//        bonus.setEname("testname1");
        bonus.setJob("testjob11");
        bonus.setSal(new BigDecimal("6000"));
        bonus.setComm(new BigDecimal("2000"));

        BonusExample bonusExample = new BonusExample();
        bonusExample.createCriteria().andEnameEqualTo("testname1");

        int update = bonusMapper.updateByExampleSelective(bonus, bonusExample);
        if (update > 0) {
            System.out.println("更新成功！");
        } else {
            System.out.println("更新失败！");
        }

    }

}