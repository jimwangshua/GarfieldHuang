package com.huangdapangzi.springbootlombok.test;

import lombok.ToString;
//		callSuper 是否输出超类属性方法，exclude排除某属性
@ToString(callSuper=true,exclude="interest")
public class UserToString extends UserGetterSetter{
	private String sex="男";
	private String interest="女";
}

