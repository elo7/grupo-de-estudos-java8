package com.elo7.board_game.user;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {
	@Test
	public void shouldReturnAUserName() {
		User user = new User("Celestina");
		assertEquals("Celestina", user.getUserName());
	}
}
