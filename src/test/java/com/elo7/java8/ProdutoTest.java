package com.elo7.java8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void nomeDoProduto() {
		String nomeDoProduto = "Boneca";
		Produto produto = new Produto(nomeDoProduto);
		assertEquals(nomeDoProduto, produto.getNome());
	}

	@Test
	public void verificandoNomedoProduto() {
		String nomeDoProduto = "Bola";
		Produto produto = new Produto(nomeDoProduto);
		assertEquals(nomeDoProduto, produto.getNome());
	}

}
