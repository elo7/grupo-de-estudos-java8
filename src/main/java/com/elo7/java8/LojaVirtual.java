package com.elo7.java8;

import java.util.Scanner;
import java.util.Set;

public class LojaVirtual {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Por favor se identifique:");
		String newSeller = in.next();
		System.out.println("Senha:");
		String password = in.next();

		Login login = new Login();
		login.loggedUser(newSeller, password);

		Vendedor loggedUser = login.getUser();
		System.out.println("Bom dia "+ loggedUser.getName() +", escolha uma opção:");
		System.out.println("1 - Listar produtos");
		System.out.println("2 - Adicionar produto");
		System.out.println("3 - Sair");

		int opcaoSelecionada = in.nextInt();

		switch (opcaoSelecionada) {
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
				Produto produto = new Produto("Sanfona", 10.0);
				loggedUser.adicionaProduto(produto);
				break;
			default:
				System.out.println("Opção inválida");
				break;
		}
	}
}