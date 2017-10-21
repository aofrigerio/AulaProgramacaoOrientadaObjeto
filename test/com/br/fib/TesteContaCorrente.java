package com.br.fib;

public class TesteContaCorrente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("JOAO", GeneroEnum.MASCULINO, "32030630", "377477");

		Cliente cliente2 = new Cliente("MARIA", GeneroEnum.FEMININO, "33660363", "034735");

		ContaCorrente c1 = new ContaCorrente(cliente1);
		c1.deposito(100.0);

		ContaCorrente c2 = new ContaCorrente(cliente2);

		System.out.println(c1.getSaldo() + " : " + c2.getSaldo());

		if (c1.transferePara(c2, 150)) {
			System.out.println("TRANSFERENCIA FEITA COM SUCESSO");
		} else {
			System.out.println("NÃO EFETUADA");
		}

		System.out.println(c1.getSaldo() + " : " + c2.getSaldo());

	}

}
