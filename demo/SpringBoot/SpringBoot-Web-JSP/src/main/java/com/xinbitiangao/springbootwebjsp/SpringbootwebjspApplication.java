package com.xinbitiangao.springbootwebjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 主类修改继承自SpringBootServletInitializer
 */
@SpringBootApplication
public class SpringbootwebjspApplication extends SpringBootServletInitializer {

    /**
     * 实现父类方法
     * @param application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootwebjspApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootwebjspApplication.class, args);
    }
}
