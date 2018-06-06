package com.huangdapangzi.springbootservlet.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by 黄大胖子
 * 2018/6/6 12:57
 */

@SpringBootApplication
@ServletComponentScan   //启动器启动时，扫描本目录以及子目录带有的webservlet注解的
public class FirstServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstServletApplication.class, args);
    }
}
