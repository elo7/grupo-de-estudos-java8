package com.elo7.java8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class VendedorServiceTest {

	private VendedorService vendedorService;

	@Before
	public void setup() {
		this.vendedorService = new VendedorService();

	}

	@Test
	public void deveCriarNovoVendedor() throws Exception {
		Vendedor vendedor = vendedorService.novoVendedor("Aline");
		assertNotNull(vendedor);
	}

	@Test
	public void verificaSeRealmenteEUmVendedor() {
		Vendedor vendedor = vendedorService.novoVendedor("Cael");
		assertEquals("Cael", vendedor.getName());

	}
}
