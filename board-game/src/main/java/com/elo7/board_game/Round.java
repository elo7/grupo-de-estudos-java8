package com.elo7.board_game;

import java.util.List;

import com.elo7.board_game.user.User;

public class Round {

	private final List<User> players;

	public Round(List<User> players) {
		this.players = players;
	}

	public List<User> getPlayersList() {
		return players;
	}

	public int getNumberOfPlayers() {
		return players.size();
	}

}
