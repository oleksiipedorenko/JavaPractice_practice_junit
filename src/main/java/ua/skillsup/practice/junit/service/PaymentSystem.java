package ua.skillsup.practice.junit.service;

import ua.skillsup.practice.junit.model.ClientId;

import java.math.BigDecimal;

/**
 * Service represents payments manager to accept or revert client money transfer
 */
public interface PaymentSystem {

	/**
	 * Incoming payment from client
	 *
	 * @param clientId client identifier to assign payment for
	 * @param amount   full payment amount
	 */
	void debit(ClientId clientId, BigDecimal amount);

	/**
	 * An operation to move money back to client
	 *
	 * @param clientId client identifier to assign payment for
	 * @param amount   full payment amount
	 */
	void credit(ClientId clientId, BigDecimal amount);
}
