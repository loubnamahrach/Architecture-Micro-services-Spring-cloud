package com.example.inventoryservice;

import com.example.inventoryservice.entities.Product;
import com.example.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner start(ProductRepository prodcutRepository){
		return args -> {
			prodcutRepository.save(Product.builder().name("Computer").price(34000).quantity(12).build());
			prodcutRepository.save(Product.builder().name("Printer").price(1200).quantity(10).build());
			prodcutRepository.save(Product.builder().name("Smartphone").price(11000).quantity(6).build());


		};
	}

}
