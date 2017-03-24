package com.elo7.board_game.games;

import java.util.ArrayList;
import java.util.List;

import com.elo7.board_game.Round;
import com.elo7.board_game.user.User;

public class Match {

	private final List<User> playerList = new ArrayList<>();
	private final List<Round> roundList = new ArrayList<>();

	public List<User> getPlayerList() {
		return playerList;
	}

	public void addPlayer(User player) {
		playerList.add(player);
	}

	public List<Round> getRoundList() {
		return roundList ;
	}

	public void addRound(List<User> players) {
		roundList.add(new Round(players));
	}

	public User getWinner() {
		return null;
	}
}
