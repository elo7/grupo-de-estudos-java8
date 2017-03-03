package com.elo7.board_game.games;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.elo7.board_game.games.Ranking.RankingPosition;
import com.elo7.board_game.user.User;

public class RankingTest {

	@Test
	public void shouldReturnUsersPositionOfSpecificGame() {
		User userOne = new User("Cael");
		User userTwo = new User("Celestino");
		User userThree = new User("Aline NY");

		SkullKing skullKing = new SkullKing();

		skullKing.setUserScore(userOne, 5);
		skullKing.setUserScore(userTwo, 10);
		skullKing.setUserScore(userThree, 1);

		List<RankingPosition> usersPositionOfGame = skullKing.getRanking().getUsersPositionOfGame();

		assertEquals(10, usersPositionOfGame.iterator().next().getScore());

	}
}
