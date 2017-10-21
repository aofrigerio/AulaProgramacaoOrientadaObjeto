package com.br.fib;

import java.text.NumberFormat;

public class TesteConta {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente(null);

		conta.deposito(100);

		System.out.println(NumberFormat.getCurrencyInstance().format(conta.getSaldo()));

		if (conta.saque(150)) {
			System.out.println("SACOU");
		} else {
			System.out.println(":(");

		}

		System.out.println(NumberFormat.getCurrencyInstance().format(conta.getSaldo()));

	}

}
