package com.devsuperior.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio.entities.Order;
import com.devsuperior.desafio.services.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order o1 = new Order(1034, 150.00, 20.0);
		Order o2 = new Order(2282, 800.0, 10.0);
		Order o3 = new Order(1309, 95.90, 0.0);
		
		System.out.printf("Pedido código: " + o1.getCode() + "\nValor total: R$ %.2f\n", orderService.total(o1));
		System.out.println("");
		System.out.printf("Pedido código: " + o2.getCode() + "\nValor total: R$ %.2f\n", orderService.total(o2));
		System.out.println("");
		System.out.printf("Pedido código: " + o3.getCode() + "\nValor total: R$ %.2f\n", orderService.total(o3));
		
	}

}
