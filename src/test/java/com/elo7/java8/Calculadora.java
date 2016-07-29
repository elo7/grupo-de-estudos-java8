package com.elo7.java8;

public class Calculadora {
	public int calcula(int i, int j, Operadores operador) {
		return operador.calcula(i,j);
	}

}

enum Operadores {
	SOMA {
		@Override
		public int calcula(int i, int j) {
			return i+j;
		}
	},
	SUBTRACAO {
		@Override
		public int calcula(int i, int j) {
			return i-j;
		}
	};

	public abstract int calcula(int i, int j);
}