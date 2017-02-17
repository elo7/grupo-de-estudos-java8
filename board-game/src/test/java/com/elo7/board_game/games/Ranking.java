package com.elo7.board_game.games;

import java.util.Map;

import com.elo7.board_game.user.User;

public class Ranking {

	private Map<User, Integer> usersScoreList;

	public Map<User, Integer> getUsersPositionOfGame() {
		return usersScoreList;
	}

	public void addUserScore(User user, int score) {
		usersScoreList.put(user, score);
	}
}
