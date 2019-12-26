package com.wdcloud.wangff;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wdcloud.wangff.mapper")
public class WangffApplication {

    public static void main(String[] args) {
        SpringApplication.run(WangffApplication.class, args);
    }

}
