package com.br.fib;

public class Cliente extends Pessoa {

	private String cpf;
	private String rg;

	public Cliente(String nome, GeneroEnum sexo, String cpf, String rg) {
		super(nome, sexo);
		this.rg = rg;
		this.cpf = cpf;
	}

}
