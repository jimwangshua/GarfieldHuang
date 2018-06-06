package com.huangdapangzi.springbootlombok.test;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
public class UserNonNull {
//	用了@NonNull这个注解，在构造set等方法中都会进行非空判断
	@Getter @Setter @NonNull
	private String name;
}

