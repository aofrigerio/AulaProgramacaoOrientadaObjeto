package com.br.fib;

public enum GeneroEnum {

	MASCULINO("M"), FEMININO("F"), OUTROS("O");

	private String genero;

	private GeneroEnum(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

}
