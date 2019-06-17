package ua.skillsup.practice.junit.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class BookingOrder {

	private OrderId orderId;
	private ClientId clientId;
	private LocalDateTime bookingTime;
	private SessionId sessionId;
	private List<Place> bookedPlaces;

	public OrderId getOrderId() {
		return orderId;
	}

	public void setOrderId(OrderId orderId) {
		this.orderId = orderId;
	}

	public ClientId getClientId() {
		return clientId;
	}

	public void setClientId(ClientId clientId) {
		this.clientId = clientId;
	}

	public LocalDateTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public SessionId getSessionId() {
		return sessionId;
	}

	public void setSessionId(SessionId sessionId) {
		this.sessionId = sessionId;
	}

	public List<Place> getBookedPlaces() {
		return bookedPlaces;
	}

	public void setBookedPlaces(List<Place> bookedPlaces) {
		this.bookedPlaces = bookedPlaces;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		BookingOrder that = (BookingOrder) o;
		return Objects.equals(orderId, that.orderId) &&
				Objects.equals(clientId, that.clientId) &&
				Objects.equals(bookingTime, that.bookingTime) &&
				Objects.equals(sessionId, that.sessionId) &&
				Objects.equals(bookedPlaces, that.bookedPlaces);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, clientId, bookingTime, sessionId, bookedPlaces);
	}

	@Override
	public String toString() {
		return "BookingOrder{" +
				", orderId=" + orderId +
				", clientId=" + clientId +
				", bookingTime=" + bookingTime +
				", sessionId=" + sessionId +
				", bookedPlaces=" + bookedPlaces +
				'}';
	}
}
