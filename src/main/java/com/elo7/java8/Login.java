package com.elo7.java8;

import java.util.Scanner;

public class Login {

	private Vendedor loggedSeller;

	public static void login() {
		Scanner in = new Scanner(System.in);

		System.out.println("Por favor se identifique:");
		String nomeVendedor = in.next();

	}

	public void loggedUser(String userName, String password) {
		VendedorService vendedorService = new VendedorService();
		//TODO: Should search seller ...
		loggedSeller = vendedorService.novoVendedor(userName);
	}

	public boolean hasLoggedUser() {
		if (loggedSeller!=null) {
			return true;
		} else {
			return false;
		}
	}

	public void logout() {
		loggedSeller = null;
	}

	public Vendedor getUser() {
		return loggedSeller;
	}
}
