package com.elo7.java8;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class VendedorTest {

	private Vendedor vendedor;

	@Before
	public void inicializaTeste() {
		vendedor = new Vendedor("Celesteman");
	}

	@Test
	public void deveRetornarProdutos() throws Exception {
		Produto produto = new Produto("Bola", 10.0);
		vendedor.adicionaProduto(produto);
		Set<Produto> produtos = new HashSet<>();
		produtos.add(produto);
		assertEquals(produtos, vendedor.produtos());
	}

	@Test
	public void umaLojaPodeIncluirUmNovoProduto() {
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		assertThat(vendedor.produtos(), hasSize(1));
	}

	@Test
	public void umaLojaPodeIncluirDoisProdutos() {
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		vendedor.adicionaProduto(new Produto("Bola", 10.0));
		assertThat(vendedor.produtos(), hasSize(2));
	}

	@Test
	public void umaLojaNaoPodeTerProdutosRepetidos() {
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		assertThat(vendedor.produtos(), hasSize(1));
	}

	@Test
	public void vendedorPodeReajustarOPrecoDeTodosOsProdutos() {
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		vendedor.adicionaProduto(new Produto("Bola", 100.0));
		vendedor.aplicaReajusteParaTodosOsProdutos(10);

		assertThat(vendedor.produtos(), contains(
				new Produto("Boneca", 11),
				new Produto("Bola", 110)));
	}

	@Test
	public void calculaAMediaDePrecoDosProdutosDaLoja() {
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		vendedor.adicionaProduto(new Produto("Bola", 100.0));
		double media = vendedor.getMediaDePrecoDosProdutos();
		assertEquals(55.0, media, 0.001);
	}

	@Test
	public void calculaAMediaDePrecoDosProdutosDaLojaAposOReajuste() {
		vendedor.adicionaProduto(new Produto("Boneca", 10.0));
		vendedor.adicionaProduto(new Produto("Bola", 100.0));
		vendedor.aplicaReajusteParaTodosOsProdutos(10);

		double media = vendedor.getMediaDePrecoDosProdutos();
		assertEquals(60.50, media, 0.001);
	}

	@Test
	public void retornaOProdutoComMenorPrecoQuandoALojaSoTemUmUnicoProduto() {
		vendedor.adicionaProduto(new Produto("Lapis", 1.0));
		assertEquals(new Produto("Lapis", 1.0), vendedor.getProdutoDeMenorPreco().get());
	}

	@Test
	public void retornaOProdutoComMenorPrecoQuandoALojaTemMaisDeUmProduto() {
		vendedor.adicionaProduto(new Produto("Urso", 10.0));
		vendedor.adicionaProduto(new Produto("Casinha", 100.0));
		assertEquals(new Produto("Urso", 10.0), vendedor.getProdutoDeMenorPreco().get());
	}

	@Test
	public void retornaOprodutoComMaiorPreco() {
		vendedor.adicionaProduto(new Produto("Urso", 10.0));
		vendedor.adicionaProduto(new Produto("Casinha", 100.0));
		assertEquals(new Produto("Casinha", 100.0), vendedor.getProdutoDeMaiorPreco().get());
	}

	@Test
	public void retornaOProdutoComMenorPrecoEmUmaLojaSemProdutos() {
		assertFalse(vendedor.getProdutoDeMenorPreco().isPresent());
	}

	@Test
	public void retornaOprodutoComMaiorPrecoEmLojaSemProdutos() {
		assertFalse(vendedor.getProdutoDeMaiorPreco().isPresent());
	}

	@Test
	public void vendedorPodeBuscarProduto() {
		Produto boneca = new Produto("Boneca", 10.0);
		Produto bola = new Produto("Bola", 10.5);

		vendedor.adicionaProduto(boneca);
		vendedor.adicionaProduto(bola);

		Optional<Produto> produtoBuscado = vendedor.buscaProduto(bola);

		assertTrue(produtoBuscado.isPresent());
		assertEquals(produtoBuscado.get(), bola);

	}

	@Test
	public void removeUmProduto() {
		Produto boneca = new Produto("Boneca", 10.0);
		Produto bola = new Produto("Bola", 10.5);

		vendedor.adicionaProduto(boneca);
		vendedor.adicionaProduto(bola);
		vendedor.removerProduto(boneca);

		Optional<Produto> produtoRemovido = vendedor.buscaProduto(boneca);

		assertFalse(produtoRemovido.isPresent());
	}

	@Test
	public void calculaValorTotalDoEstoque() {
		Produto boneca = new Produto("Boneca", 10.0);
		Produto bola = new Produto("Bola", 10.5);

		vendedor.adicionaProduto(boneca);
		vendedor.adicionaProduto(bola);

		double valorTotalDoEstoque = vendedor.valorTotalDoEstoque();

		assertEquals(valorTotalDoEstoque, 20.50, 0.1);
	}

}
