package com.sdb.crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author JianMin Xie
 * @create 2020-07-28 17:12
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.sdb.crm.mapper"})
public class SpringBootMybatisDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisDemoApplication.class,args);
    }
}
