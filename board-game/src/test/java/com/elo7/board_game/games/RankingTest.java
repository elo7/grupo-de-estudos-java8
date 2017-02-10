package com.elo7.board_game.games;

import org.junit.Test;

import com.elo7.board_game.user.User;

public class RankingTest {

	@Test
	public void shouldReturnAUsersPositionOfSpecificGame() {
		User userOne = new User("Cael");
		User userTwo = new User("Celestino");

		SkullKing skullKing = new SkullKing();

		skullKing.setScore(userOne, 5);
		skullKing.setScore(userTwo, 10);

		Ranking ranking = new Ranking();
		ranking.getUsersPositionOfGame(skullKing);

	}
}
