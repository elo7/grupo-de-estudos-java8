package com.elo7.java8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void nomeDoProduto() {
		String nomeDoProduto = "Boneca";
		Produto produto = new Produto(nomeDoProduto, 10.0);
		assertEquals(nomeDoProduto, produto.getNome());
	}

	@Test
	public void verificandoNomedoProduto() {
		String nomeDoProduto = "Bola";
		Produto produto = new Produto(nomeDoProduto, 10.0);
		assertEquals(nomeDoProduto, produto.getNome());
	}

	@Test
	public void precoDoProduto() {
		Produto produto = new Produto("peao", 10);
		assertEquals(10, produto.getPreco(), 0.001);
	}

	@Test
	public void podeAlterarNomeDoProduto() {
		Produto produto = new Produto("Boneca", 10.0);
		produto.setNome("Mouse");
		assertEquals("Mouse", produto.getNome());
	}

	@Test
	public void reajustaPrecoDoProduto() {
		Produto produto = new Produto("Macbook", 1000.10);
		produto.aplicaReajuste(10);
		assertEquals(1100.11, produto.getPreco(), 0.001);
	}

}
