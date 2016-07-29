package com.elo7.java8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
	@Test
	public void deveSomar() {
		Calculadora calculadora = new Calculadora();
		assertEquals(5, calculadora.calcula(2,3, Operadores.SOMA));
	}

	@Test
	public void deveSubtrair() {
		Calculadora calculadora = new Calculadora();
		assertEquals(2, calculadora.calcula(5,3, Operadores.SUBTRACAO));
	}
}
