package com.elo7.board_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardGame
{
	List<String> users = new ArrayList<String>();

	public static void main( String[] args )
	{

	}

	public void setUsers(String[] users) {
		this.users = Arrays.asList(users);
	}

	public List<String> getUsers() {
		this.setUsers(new String[] {"celestina","dieguito de las palombetas"});
		return this.users;
	}
}
