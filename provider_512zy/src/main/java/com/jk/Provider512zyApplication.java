package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableTransactionManagement  //开启当前项目的事务管理
@ImportResource("classpath:spring-dubbo-provider.xml") //加载spring-dubbo-provider.xml文件
@MapperScan("com.jk.mapper")//扫描dao层
@SpringBootApplication  //springboot项目的启动注解
public class Provider512zyApplication {

    public static void main(String[] args) {
        SpringApplication.run(Provider512zyApplication.class, args);
    }

}
