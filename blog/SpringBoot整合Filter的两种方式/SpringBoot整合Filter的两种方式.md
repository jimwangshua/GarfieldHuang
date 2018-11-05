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
@WebServlet(name = "firstServlet",urlPatterns = "/first")
public class FirstServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("firstServlet");
    }
}
```


#### - 准备fiter

```
@WebFilter(filterName = "firstFilter", urlPatterns = "/first")
public class FirstFilter implements Filter {  //记住Filter是javax.servlet包下的
    /**
     * 过滤器初始化时运行一次
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}
    /**
     * 每次接收到请求时执行
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入了firstFilter======");
        filterChain.doFilter(servletRequest, servletResponse);//放行！
        System.out.println("离开了firstFilter======");
    }
    /**
     * 销毁时运行
     */
    @Override
    public void destroy() {}
}
```

#### - 注册fiter 和 Servlet

```
@SpringBootApplication
@ServletComponentScan   //在 springBoot 启动时会扫描@WebFilter， 并将该类实例化
public class FirstFilterApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstFilterApplication.class, args);
    }
}
```
#### - 拦截效果
![image](https://note.youdao.com/favicon.ico)
### 2. 方法注册方式


