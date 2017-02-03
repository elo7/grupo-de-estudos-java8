package com.elo7.board_game.games;

import org.junit.Test;

import com.elo7.board_game.user.User;

public class RankingTest {

	@Test
	public void shouldReturnAUserPosition() {
		User userOne = new User("Cael do Borel");
		User userTwo = new User("Dieguru");

		SkullKing skullKing = new SkullKing();

		skullKing.setPoint(userOne, -10);
		skullKing.setPoint(userTwo, 10);

		Ranking ranking = new Ranking();
		ranking.getGamePositions(skullKing);
	}
}
