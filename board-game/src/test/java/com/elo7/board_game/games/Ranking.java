package com.elo7.board_game.games;

import java.util.Map;

import com.elo7.board_game.user.User;

public class Ranking {

	public Map<User, Integer> getUsersPositionOfGame(Games game) {
		return game.getGameUsersScored();
	}

}
