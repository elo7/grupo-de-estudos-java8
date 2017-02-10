package com.elo7.board_game.games;

import java.util.HashMap;
import java.util.Map;

import com.elo7.board_game.user.User;

public class SkullKing implements Games {

	private User user;
	private int score;

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setScore(User user, int score) {
		this.user = user;
		this.score =  score;
	}

	public User getUser() {
		return this.user;
	}

	public int getScore() {
		return this.score;
	}

	public Map<User, Integer> getGameUsersScored() {
		Map<User,Integer> map = new HashMap<User, Integer>();

		map.put(this.getUser(), this.getScore());

		return map;
	}

}
