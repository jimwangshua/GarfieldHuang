# SpringBoot整合Servlet的两种方式
> #### 本文环境
>     Maven3.5
>     JDK1.8
>     idea
>     SpringBoot2.0.1

- 工程pom文件加入Jar包
```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
```
### 1. 注解扫描方式
#### - 准备Servlet

```
@WebServlet(name = "firstServlet", urlPatterns = "/firstServlet")  //标记为servlet，以便启动器扫描。
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("firstServlet");
    }

}


```

#### - 注册Servlet

```
@SpringBootApplication
@ServletComponentScan   //启动器启动时，扫描本目录以及子目录带有的webservlet注解的
public class FirstServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstServletApplication.class, args);
    }
}
```

#### - 访问Servlet

![image](https://github.com/GarfieldHuang/RESOURCE/blob/master/IMG/1.jpg?raw=true)


### 2. 方法注册方式

#### - 准备Servlet
```
//这里不需要添加webServlet注解
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("SecondServlet");}}
```
#### - 注册Servlet
```
@SpringBootApplication
public class SecondServletApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecondServletApplication.class, args);
    }
    @Bean  //一定要加，不然这个方法不会运行
    public ServletRegistrationBean getServletRegistrationBean() {  //一定要返回ServletRegistrationBean
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());     //放入自己的Servlet对象实例
        bean.addUrlMappings("/secondServlet");  //访问路径值
        return bean;}}
```
#### - 访问Servlet
![image](https://github.com/GarfieldHuang/RESOURCE/blob/master/IMG/2.png?raw=true)


---
> ### 感谢您的耐心阅读，由于我还是一个未经世事的美男子，无法面面俱到的给您讲出我的内心想法，如有错误之处，请多多指正！
> ##### 江湖再见，欢迎您关注我！![image](https://github.com/GarfieldHuang/RESOURCE/blob/master/IMG/3.gif?raw=true)
> 本文项目源代码 ：
    [GarfieldHuang/JavaDemo](https://github.com/GarfieldHuang/JavaDemo)