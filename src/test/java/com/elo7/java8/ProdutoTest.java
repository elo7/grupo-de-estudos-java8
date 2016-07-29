package com.elo7.java8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void nomeDoProduto() {
		Produto produto = new Produto("Boneca");
		assertEquals("Boneca", produto.getNome());
	}

	@Test
	public void verificandoNomedoProduto() {
		Produto produto = new Produto("Bola");
		assertEquals("Bola", produto.getNome());
	}

}
