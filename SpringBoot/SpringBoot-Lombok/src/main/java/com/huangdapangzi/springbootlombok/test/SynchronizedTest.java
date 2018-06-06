package com.huangdapangzi.springbootlombok.test;

import lombok.Synchronized;

// 这个注解作用是快速生成线程同步的模版。在方法上使用整个方法线程安全。也可以在对象上使用，会造成死锁。不建议在关键字上使用。
// 最好不要用在成员变量上
public class SynchronizedTest{
	// 使用注解
	@Synchronized
	public void synchronizedTestLombox() {
		System.out.println("----1-----");
		System.out.println("----2-----");
		System.out.println("----3-----");
		System.out.println("----木-----");
		System.out.println("----头-----");
		System.out.println("----人-----");
	}
	// 不使用注解	
	private final java.lang.Object $lock = new java.lang.Object[0];
	public void synchronizedTest() {
		synchronized ($lock) {
			System.out.println("----1-----");
			System.out.println("----2-----");
			System.out.println("----3-----");
			System.out.println("----木-----");
			System.out.println("----头-----");
			System.out.println("----人-----");
	    }
	}
	
}

