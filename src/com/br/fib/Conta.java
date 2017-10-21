package com.br.fib;

public abstract class Conta {

	// o que ela tem: atributos
	private double saldo;
	private Cliente cliente;

	// deposito
	public void deposito(double valor) {

		this.saldo += valor;

	}

	// saque
	public boolean saque(double valor) {

		boolean sacou = false;

		if (valor <= this.saldo) {
			this.saldo -= valor;
			sacou = true;
		}

		return sacou;

	}

	// Exibir saldo
	public double getSaldo() {
		return saldo;
	}

	//

	public boolean transferePara(Conta destino, double valor) {

		boolean transferiu = false;

		if (saque(valor)) {
			destino.deposito(valor);
			transferiu = true;
		}

		return transferiu;

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
