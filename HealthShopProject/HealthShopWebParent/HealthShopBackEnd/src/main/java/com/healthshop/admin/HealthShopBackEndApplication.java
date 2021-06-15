package com.healthshop.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;




@SpringBootApplication
@EntityScan({"com.healthshop.common.entity"})
public class HealthShopBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthShopBackEndApplication.class, args);
	}

}
