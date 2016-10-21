package com.elo7.java8;

public class VendedorService {

	public Vendedor novoVendedor(String nome) {
		return new Vendedor(nome);
	}

}
