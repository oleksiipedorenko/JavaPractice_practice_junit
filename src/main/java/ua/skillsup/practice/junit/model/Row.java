package ua.skillsup.practice.junit.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Row {
	private final int rowNumber;
	private final int seetsAmount;
	private final List<Integer> bookedSeats;
	private final BigDecimal pricePerPlace;

	public Row(int rowNumber, int seetsAmount, List<Integer> bookedSeats, BigDecimal pricePerPlace) {
		this.rowNumber = rowNumber;
		this.seetsAmount = seetsAmount;
		this.bookedSeats = bookedSeats;
		this.pricePerPlace = pricePerPlace;
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public int getSeetsAmount() {
		return seetsAmount;
	}

	public List<Integer> getBookedSeats() {
		return bookedSeats;
	}

	public BigDecimal getPricePerPlace() {
		return pricePerPlace;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Row row = (Row) o;
		return rowNumber == row.rowNumber &&
				seetsAmount == row.seetsAmount &&
				Objects.equals(bookedSeats, row.bookedSeats) &&
				Objects.equals(pricePerPlace, row.pricePerPlace);
	}

	@Override
	public int hashCode() {
		return Objects.hash(rowNumber, seetsAmount, bookedSeats, pricePerPlace);
	}

	@Override
	public String toString() {
		return "Row{" +
				"rowNumber=" + rowNumber +
				", seetsAmount=" + seetsAmount +
				", bookedSeats=" + bookedSeats +
				", pricePerPlace=" + pricePerPlace +
				'}';
	}
}