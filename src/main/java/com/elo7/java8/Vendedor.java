package com.elo7.java8;

import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Vendedor {

	Set<Produto> listaProdutos = new HashSet<>();

	private final String nome;

	public Vendedor(String nome) {
		this.nome = nome;
	}

	public Set<Produto> produtos() {
		return listaProdutos;
	}

	public void adicionaProduto(Produto produto) {
		listaProdutos.add(produto);
	}

	public void aplicaReajusteParaTodosOsProdutos(double porcentagem) {
		listaProdutos = produtos().stream().map(produto -> produto.aplicaReajuste(porcentagem)).collect(Collectors.toSet());
	}

	public double getMediaDePrecoDosProdutos() {
		DoubleSummaryStatistics media = produtos().stream().mapToDouble(produto -> produto.getPreco()).summaryStatistics();
		return media.getAverage();
	}

	public Optional <Produto> getProdutoDeMenorPreco() {
		Optional<Produto> maisBarato = listaProdutos.stream().reduce((produto1, produto2) -> produto1.getPreco() < produto2.getPreco() ? produto1 : produto2);
		return maisBarato;
	}

	public Optional<Produto> getProdutoDeMaiorPreco() {
		Optional<Produto> maisCaro = listaProdutos.stream().reduce((produto1, produto2) -> produto1.getPreco() > produto2.getPreco() ? produto1 : produto2);
		return maisCaro;
	}

	public String getName() {
		return this.nome;
	}

	public void removerProduto(Produto produto) {
		listaProdutos.remove(produto);
	}

	public Optional<Produto> buscaProduto(Produto produto) {
		Optional<Produto> produtoBuscado = listaProdutos.stream().filter(prod -> prod.equals(produto)).findFirst();
		return produtoBuscado;
	}

	public double valorTotalDoEstoque() {
		return listaProdutos.stream().mapToDouble(produto -> produto.getPreco()).sum();
	}

}
