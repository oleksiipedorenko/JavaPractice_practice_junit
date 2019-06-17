package ua.skillsup.practice.junit.model;

import java.util.Objects;

public class SessionId {
	private final long id;

	private SessionId(long id) {
		this.id = id;
	}

	public static SessionId of(long id) {
		return new SessionId(id);
	}

	public long getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SessionId sessionId = (SessionId) o;
		return id == sessionId.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "SessionId{" +
				"id=" + id +
				'}';
	}
}
