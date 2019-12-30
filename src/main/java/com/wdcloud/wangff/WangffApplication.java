package com.wdcloud.wangff;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WangffApplication {

    public static void main(String[] args) {
        SpringApplication.run(WangffApplication.class, args);
    }

}
