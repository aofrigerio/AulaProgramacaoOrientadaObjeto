package com.br.fib;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	List<Conta> contas = new ArrayList<Conta>();

	public void addContas(Conta conta) {
		this.contas.add(conta);
	}

	public List<Conta> getContas() {
		return contas;
	}

}
