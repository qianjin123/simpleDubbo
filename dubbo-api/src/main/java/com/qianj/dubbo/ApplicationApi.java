package com.qianj.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qianj.dubbo.api.OrderController;

public class ApplicationApi {
	public static void main(String[] args) {
		System.setProperty("java.net.preferIPv4Stack", "true");
		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("classpath:bean.xml");
		
		ctx.start();
        System.out.println("Consumer started.");
        OrderController orderController = (OrderController) ctx.getBean("orderController");
		orderController.test();
        try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	
	}
}
