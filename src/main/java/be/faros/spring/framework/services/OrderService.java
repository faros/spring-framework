package be.faros.spring.framework.services;

import be.faros.spring.framework.domain.Order;

public interface OrderService {
	
	Order getOrderDetails(Long orderId);

}
