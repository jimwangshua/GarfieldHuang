#   Springboot之开发web应用-json接口开发 入门简例
    本文介绍了如何开发一个web的json接口应用
> #### 本文环境
>     Maven3.5
>     JDK1.8
>     Eclipse2018（需要安装sts插件）
>     SpringBoot2.0.1

### 1. 新建一个SpringBoot项目
    参考《SpringBoot-HelloWorld之初见倾心！图文详细使用Eclipse创建版》
    
### 2. Json接口开发的导包
```
查看项目Pom文件是否有这个配置，如果无则添加
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
### 3. Controller所用注解解释
所用注解

注解 | 功能
---|---
@Controller | 注解注释的类作为模板,说明它的角色。dispatcher扫描这些被注解的类用来映射标记了@RequestMapping注解的方法
@ResponseBody | 注解的作用是将controller的方法返回的对象通过适当的转换器默认转换为指定的json格式返回，在使用此注解之后不会再视图处理器，而是直接将数据写入到输入流。
@RestController | 注解相当于@ResponseBody ＋ @Controller合在一起的作用，注解在类上，所有返回的对象都是json字符串形式的数据
@RequestMapping | 注解是 Spring Web 应用程序中最常被用到的注解之一。这个注解会将 HTTP 请求映射到 MVC 和 REST 控制器的处理方法上。 
@RequestParam | 注解用于将请求参数区数据映射到功能处理方法的参数上。

### 4. json服务代码实现
1. UserController代码
```
//@Controller  注册Controller对象
@RestController // @Controller与 ResponseBody合二为一注解
@RequestMapping(path = "/user") // 地址值
public class UserController {

	/**
	 * 获取user信息 接受无参请求
	 * 
	 * @return user对象
	 */
	// @ResponseBody 如果不加@RestController注解就加这个注解，同样能让方法返回json格式数据对象
	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.setName("黄大胖子");
		user.setAge(18);
		user.setCurrentTime(new Date(System.currentTimeMillis()));
		/**
		 * 我们只需要把对象返回去， 
		 * 我们在前面加了注解， 
		 * Spring会帮我自动把对象转换成json数据.
		 * 他的底层调用了jackson，为我们转换
		 */
		return user;
	}

	/**
	 * 
	 * 接收name参数
	 * 
	 * @return user对象
	 */
	@RequestMapping("/setUserName")
	public User setUserName(@RequestParam(value = "name", defaultValue = "黄大胖子") String name) {
		User user = new User();
		user.setName(name);
		user.setAge(18);
		user.setCurrentTime(new Date(System.currentTimeMillis()));
		return user;
	}

	/**
	 * 接收请求地址值的参数name参数
	 * 
	 * @return user对象
	 */
	@RequestMapping("/setUserName/{name}")
	public User setUserNamePath(@PathVariable("name") String name) {
		User user = new User();
		user.setName(name);
		user.setAge(18);
		user.setCurrentTime(new Date(System.currentTimeMillis()));
		return user;
	}

	/**
	 * 接收Json的参数name参数
	 * 
	 * @return user对象
	 */
	@RequestMapping("/setUser")
	public User setUser(@RequestBody User user) {
		return user;
	}

}

```

2. User代码 

```
public class User {
	// 用户姓名
	private String name;
	// 年龄
	private Integer age;
	// 登录时间
	private Date currentTime;
    
    get/set方法省略
}

```
> #### 从上面的案例我们可以粗略的概括一点点论定：
> 1. 从返回值来说：如果要整个Controller返回json格式数据，我们就在类的开头加上@RestController注解，如果是要单个方法返回json数据的话，就在方法上加@ResponseBody注解。
> 2. 从接收参数来说：如果用户有参传入，就在小括号内对应用户传入的参数名称声明几个形参【形参名称一定要和用户传入参数对应】。如果不对应参数名称可以通过@RequestParam注解来指定参数名称，从而注入到注解的参数中。接受json请求时，通过@RequestBody注解，传入到注解对象中【注解对象里的参数名一定要对应用户传入的参数名称】

> #### 如果上面啰嗦，那就再简单的概括一句话：
> 返回json要注解，方法@ResponseBody类@RestController。
传入参数看情况，反正名称要对上。


#### 那么怎么测试我们写好的Json接口呢？总不至于我们要垮垮垮的把所有都写好，然后在网页上测试吧？下篇我们将介绍一个测试接口工具


---
> ### 感谢您的耐心阅读，由于我还是一个未经世事的美男子，无法面面俱到的给您讲出我的内心想法，如有错误之处，请多多指正！
> ##### 江湖再见，欢迎您关注我！![image](https://github.com/GarfieldHuang/RESOURCE/blob/master/IMG/3.gif?raw=true)
> 本文项目源代码 ：
    [GarfieldHuang/JavaDemo](https://github.com/GarfieldHuang/JavaDemo)