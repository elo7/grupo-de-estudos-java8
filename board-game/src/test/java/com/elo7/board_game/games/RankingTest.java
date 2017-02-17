package com.elo7.board_game.games;

import org.junit.Test;

import com.elo7.board_game.user.User;

public class RankingTest {

	@Test
	public void shouldReturnUsersPositionOfSpecificGame() {
		User userOne = new User("Cael");
		User userTwo = new User("Celestino");

		SkullKing skullKing = new SkullKing();

		skullKing.setUserScore(userOne, 5);
		skullKing.setUserScore(userTwo, 10);

		skullKing.getRanking().getUsersPositionOfGame();

	}
}
