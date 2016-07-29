package com.elo7.java8;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
	ArrayList<Produto> listaProdutos = new ArrayList<>();

	public List<Produto> produtos() {
		return listaProdutos;
	}

	public void adicionaProduto(Produto produto) {
		listaProdutos.add(produto);
	}

}
