package com.elo7.java8;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class VendedorTest {

	@Test
	public void deveRetornarProdutos() throws Exception {
		Vendedor vendedor = new Vendedor();
		Produto produto = new Produto("Bola");
		vendedor.adicionaProduto(produto);
		Set<Produto> produtos = new HashSet<>();
		produtos.add(produto);
		assertEquals(produtos, vendedor.produtos());
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

	@Test
	public void umaLojaNaoPodeTerProdutosRepetidos() {
		Vendedor vendedor = new Vendedor();
		vendedor.adicionaProduto(new Produto("Boneca"));
		vendedor.adicionaProduto(new Produto("Boneca"));
		assertEquals(1, vendedor.produtos().size());
	}

	@Test
	public void umaLojaPodeEditarUmProduto() {
		Vendedor vendedor = new Vendedor();
		Produto produto = vendedor.getProduto("Boneca");
		produto.setNome("Mouse");
		assertEquals("Mouse", produto.getNome());
	}

}
