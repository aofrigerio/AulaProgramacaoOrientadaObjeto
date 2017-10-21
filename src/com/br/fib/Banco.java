package com.br.fib;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	// Cria uma lista
	List<Conta> contas = new ArrayList<Conta>();

	public void addContas(Conta conta) {
		this.contas.add(conta);
	}

	public List<Conta> getContas() {
		return contas;
	}

	public double mostrarSaldo() {

		double valorTotal = 0.0;

		for (int i = 0; i < contas.size(); i++) {
			Conta conta = this.contas.get(i);
			valorTotal += conta.getSaldo();
		}

		return valorTotal;
	}

}
