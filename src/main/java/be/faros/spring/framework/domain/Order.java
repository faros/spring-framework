package be.faros.spring.framework.domain;

public class Order {
	
	private String orderName;

	public Order(String oName) {
		this.orderName = oName;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

}
