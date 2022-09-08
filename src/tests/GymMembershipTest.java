/**
 * Michael Van Riessen - mjvanriessen
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Client;
import model.GymAccount;


public class GymMembershipTest {
	
	Client client = new Client("Michael", "Van Riessen", 21, "9998887777");
	GymAccount account = new GymAccount(client, "Des Moines", "Student");
	

	public void setUp() throws Exception {
	}

	@Test
	public void testTierPayment() {
		account.tierPayment();
		assertEquals(75.00, account.getBalanceDue(), 0.0);
	}
	
	@Test
	public void testTaxedBalance() {
		account.tierPayment();
		account.taxedBalance();
		assertEquals(79.50, account.getBalanceDue() , 0.0);
	}

}
