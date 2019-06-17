package ua.skillsup.practice.junit.model;

import java.util.Objects;

public class OrderId {
	private final long id;

	private OrderId(long id) {
		this.id = id;
	}

	public static OrderId of(long id) {
		return new OrderId(id);
	}

	public long getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		OrderId orderId = (OrderId) o;
		return id == orderId.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "OrderId{" +
				"id=" + id +
				'}';
	}
}