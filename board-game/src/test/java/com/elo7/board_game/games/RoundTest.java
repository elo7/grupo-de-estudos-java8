package com.elo7.board_game.games;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.elo7.board_game.Round;
import com.elo7.board_game.user.User;

public class RoundTest {


	@Test
	public void shouldReturnFirstPlayer() {

	}

	@Test
	public void shouldAddScoreOfPlayer() throws Exception {
	}

	@Test
	public void shouldReturnTheListOfPlayers() {
		Match match = new Match();
		User cael = new User("Cael");
		User celestino = new User("Celestino");
		User diego = new User("Diego");

		match.addPlayer(cael);
		match.addPlayer(celestino);
		match.addPlayer(diego);

		Round round = new Round(match.getPlayerList());

		assertEquals(round.getNumberOfPlayers(), 3);

	}
}
