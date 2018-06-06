package com.huangdapangzi.springbootlombok.test;

import lombok.Data;
//这个注解最常用，它结合了功能成@ToString, @EqualsAndHashCode, @Getter和@Setter
//@Data
//@Data设置staticConstructor可以生成静态工厂方法，生成参数指定名称的静态工厂方法
@Data(staticConstructor="getUserData")
public class UserData{
	private String name;
	private Integer age;
	private String sex="男";
	private String interest="女";
	private Double money=100.0;
}

