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
}
