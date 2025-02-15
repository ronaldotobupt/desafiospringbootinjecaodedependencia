package com.ronaldosantos.desafioinjecaodedependencia;


import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ronaldosantos.desafioinjecaodedependencia.entities.Order;
import com.ronaldosantos.desafioinjecaodedependencia.services.ShippingService;

@SpringBootApplication
public class DesafioinjecaodedependenciaApplication implements CommandLineRunner {
	Scanner sc = new Scanner(System.in);
	
	@Autowired
	private ShippingService shippingService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioinjecaodedependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("Código do pedido: ");
		Integer code = sc.nextInt();
		System.out.print("Valor do pedido: ");
		Double basic = sc.nextDouble();
		System.out.print("Valor do desconto: ");
		Double discount = sc.nextDouble();
		
		Order order = new Order(code,basic,discount);
		
		System.out.println("Pedido Código: " + order.getCode());
		System.out.printf("Valor Total: R$ %.2f\n" , shippingService.shipment(order));
		
	}

}
