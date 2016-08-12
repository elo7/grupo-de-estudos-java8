package com.elo7.java8;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.hamcrest.Matchers;
import org.junit.Test;

public class VendedorTest {

	@Test
	public void deveRetornarProdutos() throws Exception {
		Vendedor vendedor = new Vendedor();
		Produto produto = new Produto("Bola", 10.0);
		vendedor.adicionaProduto(produto);
		Set<Produto> produtos = new HashSet<>();
		produtos.add(produto);
		assertEquals(produtos, vendedor.produtos());
	}

	@Test
	public void umaLojaPodeIncluirUmNovoProduto() {
		Vendedor vendedor = new Vendedor();
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		assertThat(vendedor.produtos(), Matchers.hasSize(1));
	}

	@Test
	public void umaLojaPodeIncluirDoisProdutos() {
		Vendedor vendedor = new Vendedor();
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		vendedor.adicionaProduto(new Produto("Bola", 10.0));
		assertThat(vendedor.produtos(), hasSize(2));
	}

	@Test
	public void umaLojaNaoPodeTerProdutosRepetidos() {
		Vendedor vendedor = new Vendedor();
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		assertThat(vendedor.produtos(), hasSize(1));
	}

	@Test
	public void vendedorPodeReajustarOPrecoDeTodosOsProdutos() {
		Vendedor vendedor = new Vendedor();
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		vendedor.adicionaProduto(new Produto("Bola", 100.0));
		vendedor.aplicaReajusteParaTodosOsProdutos(10);

		assertThat(vendedor.produtos(), contains(
					new Produto("Boneca", 11),
					new Produto("Bola", 110)));
	}

}
