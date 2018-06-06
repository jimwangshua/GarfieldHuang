package com.huangdapangzi.springbootservlet.build;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * Created by 黄大胖子
 * 2018/6/6 12:57
 */

@SpringBootApplication
public class SecondServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondServletApplication.class, args);
    }


    @Bean  //一定要加，不然这个方法不会运行
    public ServletRegistrationBean getServletRegistrationBean() {  //一定要返回ServletRegistrationBean
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());     //放入自己的Servlet对象实例
        bean.addUrlMappings("/secondServlet");  //访问路径值
        return bean;
    }
}
