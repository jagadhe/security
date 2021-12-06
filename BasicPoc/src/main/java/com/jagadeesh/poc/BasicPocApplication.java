package com.jagadeesh.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.jagadeesh.poc.model.Address;
import com.jagadeesh.poc.model.Order1;
import com.jagadeesh.poc.model.OrderProducts;
import com.jagadeesh.poc.model.Product;
import com.jagadeesh.poc.model.User;
import com.jagadeesh.poc.repo.AddressRepository;
import com.jagadeesh.poc.repo.Order1Repository;
import com.jagadeesh.poc.repo.OrderProductRepository;
import com.jagadeesh.poc.repo.ProductRepository;
import com.jagadeesh.poc.repo.UserRepository;
@EnableWebSecurity
@SpringBootApplication
public class BasicPocApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BasicPocApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private Order1Repository order1Repository;
	
	@Autowired
	private OrderProductRepository orderProductRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 User user = new User();
		 user.setUsername("deepak");
		 user.setEmail("jagadeeshjai1998@gmail.com");
		 user.setMobile("8190292893");
		 user.setIsActive("No");
		 user.setCreatedAt("19jun2019");
		 user.setCreatedBy("jithu");
		 user.setModifiedAt("21april2020");
		 user.setModifiedBy("sai");
		 
		 
		 
		 Address address = new Address();
		 address.setAddress1("gantavur");
		 address.setAddress2("begumpet");
		 address.setPincode("517290");
		 address.setIsPrimary("yes");
		 address.setCreatedAt("18feb2020");
		 address.setCreatedBy("rasool");
		 address.setModifiedAt("19nov2021");
		 address.setModifiedBy("Reddy");
		 address.setIsActive("yes");
		 		
			
		 user.setUserId(address);
		 address.setUser(user);
		 
		 userRepository.save(user);
		 
		 Product product = new Product();
		 product.setProduct_name("nivea");
		 product.setProduct_SKU("inquality");
		 product.setPrice(1500.00);
		 product.setQty("less");
		 product.setIsActive("No");
		 product.setCreatedAt("25apr2020");
		 product.setCreatedBy("jithendra");
		 product.setModifiedAt("23nov2020");
		 product.setModifiedBy("sai");
		 
		 productRepository.save(product);
		 
		 
		 Order1 order1 = new Order1();
		 order1.setOrder_total("so less");
		 order1.setTotal_qty("thousand");
		 order1.setCreatedAt("25jun2020");
		 order1.setCreatedBy("lakshitha");
		 order1.setModifiedAt("25july2021");
		 order1.setModifiedBy("riana");
		 
		 
		 OrderProducts orderProducts = new OrderProducts();
		 orderProducts.setProduct_price("ten_thousand_rupees");
		 orderProducts.setProduct_qty("less");
		 
		 orderProducts.setOrder1(order1);
		 order1.setOrderId(orderProducts);
		 
		order1.setOrderId(orderProducts);
		 orderProducts.setOrder1(order1);
		 
		 order1Repository.save(order1);
		 orderProductRepository.save(orderProducts);
	}
	
	

}

