package be.faros.spring.framework.repositories;

import org.springframework.stereotype.Component;

import be.faros.spring.framework.domain.Order;

@Component
public class OrderRepositoryImpl implements OrderRepository {

	@Override
	public Order getOrderDetails(Long orderId) {
		return new Order("myOrder");
	}

}
