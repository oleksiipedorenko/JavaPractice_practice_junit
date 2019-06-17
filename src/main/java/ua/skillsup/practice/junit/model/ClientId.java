package ua.skillsup.practice.junit.model;

import java.util.Objects;

public class ClientId {
	private final long id;

	private ClientId(long id) {
		this.id = id;
	}

	public static ClientId of(long id) {
		return new ClientId(id);
	}

	public long getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ClientId clientId = (ClientId) o;
		return id == clientId.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "ClientId{" +
				"id=" + id +
				'}';
	}
}
