package com.br.fib;

public class TesteContaPoupanca {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("JOAO", GeneroEnum.MASCULINO, "1111", "3333");

		ContaCorrente cc = new ContaCorrente(c1);

		cc.deposito(150);

		ContaPoupança cp = new ContaPoupança(c1);

		System.out.println(cc.getSaldo() + " :  " + cp.getSaldo());

		if (cc.transferePara(cp, 90.0)) {
			System.out.println("TRANSFERENCIA FEITA COM SUCESSO");
		} else {
			System.out.println("NÃO EFETUADA");
		}

		System.out.println(cc.getSaldo() + " :  " + cp.getSaldo());

	}

}
