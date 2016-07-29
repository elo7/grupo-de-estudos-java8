package com.elo7.java8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void nomeDoProduto() {
		Produto produto = new Produto();
		assertEquals("bla", produto.getNome());
	}

}
