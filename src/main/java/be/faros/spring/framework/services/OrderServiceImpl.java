package be.faros.spring.framework.services;

import org.springframework.stereotype.Component;

import be.faros.spring.framework.domain.Order;
import be.faros.spring.framework.repositories.OrderRepository;

@Component
public class OrderServiceImpl implements OrderService {

	private OrderRepository orderRepository;

	/*
	 * Implicit constructor injection for single-constructor scenarios (no @Autowired needed)
	 * 
	 * https://spring.io/blog/2016/03/04/core-container-refinements-in-spring-framework-4-3
	 * (Spring uses 3th party lib 'Objenesis' to avoid the need for default constructors) 
	 * 
	 * @Configuration classes historically did not support constructor injection. They do now as of 4.3 &
	 * they obviously allow for omitting @Autowired in a single-constructor scenario as well
	 */
	public OrderServiceImpl(OrderRepository o) {
		this.orderRepository = o;
	}

	@Override
	public Order getOrderDetails(Long orderId) {
		return orderRepository.getOrderDetails(orderId);
	}
}