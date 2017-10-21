package com.br.fib;

import java.util.Date;

public class Pessoa {

	private String nome;
	private GeneroEnum sexo;
	private Date date;

	public Pessoa(String nome, GeneroEnum sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public GeneroEnum getSexo() {
		return sexo;
	}

}
