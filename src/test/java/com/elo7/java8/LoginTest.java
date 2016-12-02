package com.elo7.java8;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginTest {
	@Test
	public void shouldUserLogged() {
		Login login = new Login();
		login.loggedUser("Cael", "1234");
		assertTrue(login.hasLoggedUser());
	}

	@Test
	public void shouldUserUnlogged() {
		Login login = new Login();
		login.loggedUser("Cael","1234");
		login.logout();
		assertFalse(login.hasLoggedUser());
	}

}
