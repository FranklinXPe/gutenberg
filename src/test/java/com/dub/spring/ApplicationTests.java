package com.dub.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.dub.spring.repository.OrderRepository;
import com.dub.spring.repository.UserRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(ApplicationTests.class);

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Test
	public void contextLoads() {
		
		System.out.println("ContextLoads completed");
	}
	
	
	
}
