package com.elo7.board_game.games;

public interface Games {

	int getId();
	int getTime();
	String getName();
	String getDescription();
	String getType();
	Ranking getRanking();
}
