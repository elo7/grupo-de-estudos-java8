package com.elo7.java8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class VendedorTest {

	@Test
	public void deveRetornarProdutos() throws Exception {
		Vendedor vendedor = new Vendedor();
		assertEquals(Arrays.asList(new Produto("Bola")), vendedor.produtos());
	}

	@Test
	public void bla() {
		Vendedor vendedor = new Vendedor();
		assertEquals(0, 0);
	}

}
