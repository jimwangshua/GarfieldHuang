package com.huangdapangzi.springbootlombok.test;

import lombok.Getter;
import lombok.Setter;
//在类上注解，这样所有属性都会生成get/set方法
@Getter @Setter 
public class UserGetterSetter {
	
//	在属性上注解，这样就会对应的生成get/set方法
//	@Getter @Setter 
	private String name;
	private Integer age;
}

