package com.elo7.java8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class VendedorTest {

	@Test
	public void deveRetornarProdutos() throws Exception {
		Vendedor vendedor = new Vendedor();
		vendedor.adicionaProduto(new Produto("Bola"));
		assertEquals(Arrays.asList(new Produto("Bola")), vendedor.produtos());
	}

	@Test
	public void umaLojaPodeIncluirUmNovoProduto() {
		Vendedor vendedor = new Vendedor();
		vendedor.adicionaProduto(new Produto("Boneca"));
		assertEquals(1, vendedor.produtos().size());
	}

	@Test
	public void umaLojaPodeIncluirDoisProdutos() {
		Vendedor vendedor = new Vendedor();
		vendedor.adicionaProduto(new Produto("Boneca"));
		vendedor.adicionaProduto(new Produto("Bola"));
		assertEquals(2, vendedor.produtos().size());
	}

}
