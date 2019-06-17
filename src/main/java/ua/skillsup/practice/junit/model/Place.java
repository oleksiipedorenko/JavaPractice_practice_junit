package ua.skillsup.practice.junit.model;

import java.util.Objects;

public class Place {
	private final int row;
	private final int seatNumber;

	public Place(int row, int seatNumber) {
		this.row = row;
		this.seatNumber = seatNumber;
	}

	public int getRow() {
		return row;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Place place = (Place) o;
		return row == place.row &&
				seatNumber == place.seatNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(row, seatNumber);
	}

	@Override
	public String toString() {
		return "Place{" +
				"row=" + row +
				", seatNumber=" + seatNumber +
				'}';
	}
}