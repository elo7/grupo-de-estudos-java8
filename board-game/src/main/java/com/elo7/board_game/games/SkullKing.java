package com.elo7.board_game.games;

import com.elo7.board_game.user.User;

public class SkullKing implements Games {

	private final Ranking ranking = new Ranking();

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

	public void setUserScore(User user, int score) {
		ranking.addUserScore(user, score);
	}

	public Ranking getRanking() {
		return ranking;
	}

}
