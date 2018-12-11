package com.qianj.dubbo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.qianj.dubbo.service.OrderService;


@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	public void test(){
		System.out.println("OrderController:----->"+orderService.getOrderList());
	}
	
}
