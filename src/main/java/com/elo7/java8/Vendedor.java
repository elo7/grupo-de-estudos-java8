package com.elo7.java8;

import java.util.DoubleSummaryStatistics;
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
		produtos().stream().map(produto -> produto.aplicaReajuste(porcentagem));
	}

	public double getMediaDePrecoDosProdutos() {
		DoubleSummaryStatistics media = produtos().stream().mapToDouble(produto -> produto.getPreco()).summaryStatistics();
		return media.getAverage();
	}
}
