package be.faros.spring.framework.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import be.faros.spring.framework.domain.Order;

/*
 * Improvements Since Spring 4.3 :
 * 
 * 		@RunWith(SpringRunner.class) : Tells JUnit to run using Spring’s testing support. 
 * 									   SpringRunner is the new name for SpringJUnit4ClassRunner = easier on the eye then 'SpringJUnit4ClassRunner.class'
 * 									   In fact: class SpringRunner extends SpringJUnit4ClassRunner
 * 
 * Testing improvements in Spring Boot 1.4 (https://spring.io/blog/2016/04/15/testing-improvements-in-spring-boot-1-4) :
 * 
 * 		@SpringBootTest : bootstrap with Spring Boot’s support  (e.g. load application.properties and give me all the Spring Boot goodness)
 * 						  Here, we’ve omitted 'classes' attr which means that the test will first attempt to load @Configuration from any inner-classes, 
 *  					  and if that fails, it will search for your primary @SpringBootApplication class
 *  
 *  Without Spring boot :
 *  
 *  	@RunWith(SpringJUnit4ClassRunner.class) // Starting from Spring 4.3 : use SpringRunner.class
 *  	@ContextConfiguration(classes = TestConfig.class)
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {
	
	@Autowired
	private OrderService orderService;

	@Test
	public void getOrderDetailsTest() {
		Order order = orderService.getOrderDetails(0L);
		assertNotNull(order);
		assertEquals("myOrder", order.getOrderName());
	}

}