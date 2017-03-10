package com.elo7.board_game.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.elo7.board_game.user.User;

public class Ranking {

	private final List<RankingPosition> usersScoreList = new ArrayList<>();

	public List<RankingPosition> getUsersPositionOfGame() {
		return usersScoreList.stream()
				.sorted((num1, num2) -> num2.getScore() - num1.getScore())
				.collect(Collectors.toList());
	}

	public void addUserScore(User user, int score) {
		RankingPosition rankingPosition = new RankingPosition(user, score);
		usersScoreList.add(rankingPosition);
	}

	public class RankingPosition {
		private final User user;
		private final int score;

		public RankingPosition(User user, int score) {
			this.user = user;
			this.score = score;
		}

		public User getUser() {
			return user;
		}

		public int getScore() {
			return score;
		}

	}

	public Optional<RankingPosition> getFirstPosition() {
		List<RankingPosition> usersPositionOfGame = this.getUsersPositionOfGame();
		if (!usersPositionOfGame.isEmpty()) {
			return Optional.of(usersPositionOfGame.get(0));
		}
		return Optional.empty();
	}

}