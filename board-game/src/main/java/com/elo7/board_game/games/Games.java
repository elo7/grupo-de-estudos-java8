package com.elo7.board_game.games;

import java.util.Map;

import com.elo7.board_game.user.User;

public interface Games {

	int getId();
	int getTime();
	String getName();
	String getDescription();
	String getType();
	Map<User, Integer> getGameUsersScored();
}
