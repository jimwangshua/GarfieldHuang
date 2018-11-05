package com.huangdapangzi.springbootlombok.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import lombok.Cleanup;
import lombok.Data;
//	@Cleanup注解，确保分配资源被释放。
//  使用时要考了清理会不会引发异常，如果引发了，由于使用了@Cleanup注解问题会被埋藏起来，看日志报错很难找到根源。
public class CleanupTest {
	
//	实现资源释放
//	加注解
	public void testCleanUpLombox() {
	    try {
	        @Cleanup ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        baos.write(new byte[] {'Y','e','s'});
	        System.out.println(baos.toString());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
//	原始方式
	public void testCleanUp() {
	    try {
	        ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        try {
	            baos.write(new byte[]{'Y', 'e', 's'});
	            System.out.println(baos.toString());
	        } finally {
	            baos.close();
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}

