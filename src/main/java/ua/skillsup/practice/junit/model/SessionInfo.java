package ua.skillsup.practice.junit.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class SessionInfo {
	private final SessionId id;
	private final List<Row> rows;
	private final LocalDateTime startTime;

	public SessionInfo(SessionId id, List<Row> rows, LocalDateTime startTime) {
		this.id = id;
		this.rows = rows;
		this.startTime = startTime;
	}

	public SessionId getId() {
		return id;
	}

	public List<Row> getRows() {
		return rows;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SessionInfo that = (SessionInfo) o;
		return id == that.id &&
				Objects.equals(rows, that.rows) &&
				Objects.equals(startTime, that.startTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, rows, startTime);
	}

	@Override
	public String toString() {
		return "SessionInfo{" +
				"id=" + id +
				", rows=" + rows +
				", startTime=" + startTime +
				'}';
	}
}