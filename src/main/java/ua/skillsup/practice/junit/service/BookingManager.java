package ua.skillsup.practice.junit.service;

import ua.skillsup.practice.junit.model.ClientId;
import ua.skillsup.practice.junit.model.OrderId;
import ua.skillsup.practice.junit.model.Place;
import ua.skillsup.practice.junit.model.SessionId;

import java.util.List;

/**
 * Manager responsible to execute client orders and book places for session.
 */
public interface BookingManager {

	/**
	 * Process order booking, initiated by a client for exact session.
	 *
	 * @param clientId     identifier of a client to book order for
	 * @param sessionId    session selected by a client
	 * @param placesToBook places to book
	 * @return executed order identifier
	 */
	OrderId book(ClientId clientId, SessionId sessionId, List<Place> placesToBook);

	/**
	 * Process procedure of undoing booking for concrete order
	 *
	 * @param id unique identifier of order
	 */
	void undoBooking(OrderId id);
}