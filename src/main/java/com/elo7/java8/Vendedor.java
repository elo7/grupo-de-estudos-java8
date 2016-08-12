package com.elo7.java8;

import java.util.HashSet;
import java.util.Set;

public class Vendedor {

	Set<Produto> listaProdutos = new HashSet<>();

	public Set<Produto> produtos() {
		return listaProdutos;
	}

	public void adicionaProduto(Produto produto) {
		listaProdutos.add(produto);
	}

	public void aplicaReajusteParaTodosOsProdutos(double porcentagem) {
		for (Produto produto : listaProdutos) {
			produto.aplicaReajuste(porcentagem);
		}
	}

	public double getMediaDePrecoDosProdutos() {
		double preco = 0;
		for (Produto produto : listaProdutos) {
			preco += produto.getPreco();
		}

		return preco / listaProdutos.size();
	}
}
