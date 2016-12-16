package com.elo7.java8;

import java.util.Scanner;
import java.util.Set;

public class LojaVirtual {


	private static final int SAIR = 4;
	private static Vendedor loggedUser;
	private static Login login = new Login();

	/**
	 * @param args
	 */
	private static int showMenu() {
		Scanner in = new Scanner(System.in);

		System.out.println("Bom dia "+ loggedUser.getName() +", escolha uma opção:");
		System.out.println("1 - Listar produtos");
		System.out.println("2 - Adicionar produto");
		System.out.println("3 - Deslogar");
		System.out.println("4 - Sair");

		return in.nextInt();
	}

	private static void showLogin() {
		Scanner in = new Scanner(System.in);
		System.out.println("Por favor se identifique:");
		String newSeller = in.next();
		System.out.println("Senha:");
		String password = in.next();

		login.loggedUser(newSeller, password);
		loggedUser = login.getUser();
	}

	public static void main(String[] args) {
		showLogin();

		while(!login.hasLoggedUser()) {
			showLogin();
		}
		int opcao = showMenu();
		while(login.hasLoggedUser() && opcao != SAIR) {
			switch (opcao) {
				case 1:
					// lista produtos
					Set<Produto> produtos = loggedUser.produtos();
					if (produtos.size() == 0) {
						System.out.println("Não existe nenhum produto, escolha a opçao 2 e cadastre um novo produto");
					} else {
						for (int i = 0; i < produtos.size(); i++) {
							System.out.println("prod= " + produtos.iterator().next());
						}
					}
					break;
				case 2:
					// adiciona produto
					Scanner inputProduct = new Scanner(System.in);
					System.out.println("Informe o nome do produto:");
					String productName = inputProduct.next();
					System.out.println("Informe o preço do Produto:");
					double productPrice = inputProduct.nextDouble();

					Produto produto = new Produto(productName, productPrice);
					loggedUser.adicionaProduto(produto);

					break;
				case 3:
					//Logout
					login.logout();
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}

			if (login.hasLoggedUser()) {
				opcao = showMenu();
			} else {
				showLogin();
			}
		}
	}
}