package com.ronaldosantos.desafioinjecaodedependencia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronaldosantos.desafioinjecaodedependencia.entities.Order;

@Service
public class ShippingService {
	
	@Autowired
	OrderService orderService;
	
	public double shipment(Order order) {
		if(order.getBasic() <= 100) {
			return orderService.total(order) + 20;
		}else if(order.getBasic() >= 200){
			return orderService.total(order) + 0;
		}
			return orderService.total(order) + 12;
		}

}
