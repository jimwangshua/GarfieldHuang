package com.huangdapangzi.springbootlombok.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Slf4jTest {
	public void testSlf4j() {
		log.debug("这是debug");
		log.info("这是Info");
		log.error("这是error");
		
		Integer errorCode = 11;
		log.error("这是error 错误代号={}", errorCode);// 传入值为object，打印时中括号会背代替掉
	}
}
