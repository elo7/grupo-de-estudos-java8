package com.elo7.java8;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
		assertEquals(1, vendedor.produtos().size());
	}

	@Test
	public void umaLojaPodeIncluirDoisProdutos() {
		Vendedor vendedor = new Vendedor();
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		vendedor.adicionaProduto(new Produto("Bola", 10.0));
		assertEquals(2, vendedor.produtos().size());
	}

	@Test
	public void umaLojaNaoPodeTerProdutosRepetidos() {
		Vendedor vendedor = new Vendedor();
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		assertEquals(1, vendedor.produtos().size());
	}

	@Test
	public void vendedorPodeReajustarOPrecoDeTodosOsProdutos() {
		Vendedor vendedor = new Vendedor();
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		vendedor.adicionaProduto(new Produto("Bola", 100.0));
		vendedor.aplicaReajusteParaTodosOsProdutos(10);

		Iterator<Produto> iterator = vendedor.produtos().iterator();
		assertEquals( 11.0, iterator.next().getPreco(), 0.001);
		assertEquals( 110.0, iterator.next().getPreco(), 0.001);
	}

}
