package com.xhjsj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(value = "com.xhjsj.mapper")
public class LAMSApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(LAMSApplication.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LAMSApplication.class);
    }
}
