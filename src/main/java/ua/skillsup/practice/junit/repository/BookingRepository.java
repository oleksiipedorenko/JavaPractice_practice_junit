package ua.skillsup.practice.junit.repository;

import ua.skillsup.practice.junit.model.BookingOrder;
import ua.skillsup.practice.junit.model.OrderId;

/**
 * Represents layer of orders storage
 */
public interface BookingRepository {

	/**
	 * Find persisted order for given identifier
	 *
	 * @param id unique order identifier
	 * @return full order information
	 */
	BookingOrder findOne(OrderId id);

	/**
	 * Persist given order
	 *
	 * @param order an order to persist
	 */
	void save(BookingOrder order);
}