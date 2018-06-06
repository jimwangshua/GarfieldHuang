package com.huangdapangzi.springbootlombok.test;

import lombok.EqualsAndHashCode;
import lombok.ToString;
//		与ToString注解用法基本相似
//		callSuper 生成时是否包含超类，exclude排除某属性
@EqualsAndHashCode(callSuper=true,exclude= {"interest","money"})
public class UserEqualsAndHashCode extends UserGetterSetter{
	private String sex="男";
	private String interest="女";
	private Double money=100.0;
}

