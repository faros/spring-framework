package be.faros.spring.framework.repositories;

import be.faros.spring.framework.domain.Order;

public interface OrderRepository {

	Order getOrderDetails(Long orderId);

}
