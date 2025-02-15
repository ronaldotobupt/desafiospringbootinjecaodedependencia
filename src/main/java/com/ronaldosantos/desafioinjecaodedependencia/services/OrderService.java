package com.ronaldosantos.desafioinjecaodedependencia.services;

import org.springframework.stereotype.Service;

import com.ronaldosantos.desafioinjecaodedependencia.entities.Order;

@Service
public class OrderService {
	
	public double total(Order order) {
		return order.getBasic()-(order.getBasic()*order.getDiscount()/100);
	}

}
