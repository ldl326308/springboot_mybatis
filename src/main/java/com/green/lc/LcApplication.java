package com.green.lc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 扫描dao层 也可以在dao层的接口写@Mapper注解代替
//@MapperScan(basePackages = "com.green.lc.dao")
public class LcApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcApplication.class, args);
    }

}
