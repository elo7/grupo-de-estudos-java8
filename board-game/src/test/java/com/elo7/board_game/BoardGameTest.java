package com.elo7.board_game;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class BoardGameTest {
	@Test
	public void shouldListUsers() {
		BoardGame boardGame = new BoardGame();
		List<String> users = boardGame.getUsers();
		assertEquals(2, users.size());
	}
}
