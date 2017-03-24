package com.elo7.board_game.games;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.elo7.board_game.Round;
import com.elo7.board_game.user.User;

public class MatchTest {

	@Test
	public void shouldReturnThePlayersList() {
		Match match = new Match();

		User celestino = new User("Celestino");
		User cael = new User("Cael");
		User vasco = new User("Vasco");
		User diego = new User("Diego");

		match.addPlayer(celestino);
		match.addPlayer(cael);
		match.addPlayer(vasco);
		match.addPlayer(diego);

		List<User> playerList = match.getPlayerList();
		assertEquals(playerList.size(), 4);
	}

	@Test
	public void shouldReturnTheListOfRounds() throws Exception {
		Match match = new Match();
		List<Round> roundList = match.getRoundList();
		match.addRound(match.getPlayerList());
		match.addRound(match.getPlayerList());
		assertEquals(roundList.size(), 2);
	}

	@Test
	public void shouldReturnTheWinner() {
		Match match = new Match();

		User cael = new User("Cael");
		User aline = new User("Aline");

		match.addPlayer(cael);
		match.addPlayer(aline);

		User winner = match.getWinner();

		assertEquals(winner, cael);
	}

}
