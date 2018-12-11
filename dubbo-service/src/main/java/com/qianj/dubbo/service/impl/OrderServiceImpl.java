package com.qianj.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.qianj.dubbo.service.OrderService;



@Service
public class OrderServiceImpl implements OrderService{

	public String getOrderList() {
		return "order 011111";
	}

}
