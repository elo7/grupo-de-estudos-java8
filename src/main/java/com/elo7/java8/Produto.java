package com.elo7.java8;

public class Produto {

	private String nome;

	public Produto(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	public String getNome() {
		return nome;
	}

}
