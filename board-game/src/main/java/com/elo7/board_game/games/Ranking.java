package com.elo7.board_game.games;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.elo7.board_game.user.User;

public class Ranking {

	private final List<RankingPosition> usersScoreList = new ArrayList<RankingPosition>();

	public List<RankingPosition> getUsersPositionOfGame() {

		//numbers = numbers.stream().sorted((num1, num2) -> num2 - num1).collect(Collectors.toList());
		return usersScoreList.stream().sorted((pos1, pos2) -> {
			if (pos2.getScore() - pos1.getScore() > 0) {
				return pos2;
			} else {
				return pos1;
			}
		}).collect(Collectors.toList());
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

}