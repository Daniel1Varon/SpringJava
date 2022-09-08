package com.platzi.market;

import com.platzi.market.persistence.crud.ProductoCrudRespository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlatziMarketApplication {

	private static ProductoCrudRespository productoCrudRespository;

	public PlatziMarketApplication(ProductoCrudRespository productoCrudRespository) {
		this.productoCrudRespository = productoCrudRespository;
	}

	public static void main(String[] args) {
		SpringApplication.run(PlatziMarketApplication.class, args);
		System.out.println(productoCrudRespository.findByCategoria_Descripcion("Pastelería"));
	}
}
