package com.qianj.dubbo.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationService {
	
	public static void main(String[] args) {
		System.setProperty("java.net.preferIPv4Stack", "true");
		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("classpath:bean.xml");
		ctx.start();
        System.out.println("Provider started.......");
        try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	
	}
}
