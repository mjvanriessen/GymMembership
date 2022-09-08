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

public class AccountCreationTest {
	
	Client client1 = new Client("John", "Smith", 35, "8883332222");
	Client client2 = new Client();
	GymAccount acct1 = new GymAccount(client1, "Chicago", "Premium");
	GymAccount acct2 = new GymAccount(client2);
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testClientAttribute() {
		assertNotNull(client1.getAge());
		assertNull(client2.getlName());
	}
	
	@Test
	public void testMembershipAttribute() {
		assertNotNull(acct1.getLocation());
		assertNull(acct2.getMemberTier());
	}
	
	@Test
	public void ageCheckTest() {
		assertTrue(acct1.adultSignature(client1));
	}

}
