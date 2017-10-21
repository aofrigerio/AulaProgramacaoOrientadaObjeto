package com.br.fib;

public class TesteBanco {

	public static void main(String[] args) {

		Banco banco = new Banco();

		Cliente c1 = new Cliente("JOAO", GeneroEnum.MASCULINO, "1111", "2222");
		ContaCorrente cc1 = new ContaCorrente(c1);
		cc1.deposito(100.0);
		banco.addContas(cc1);

		Cliente c2 = new Cliente("MARIA", GeneroEnum.FEMININO, "1111", "2222");
		ContaCorrente cc2 = new ContaCorrente(c2);
		cc2.deposito(150.0);
		banco.addContas(cc2);

		Cliente c3 = new Cliente("MARGARIDA", GeneroEnum.FEMININO, "1111", "2222");
		ContaCorrente cc3 = new ContaCorrente(c3);
		cc3.deposito(210.0);
		banco.addContas(cc3);

		Cliente c4 = new Cliente("SERGIO", GeneroEnum.MASCULINO, "1111", "2222");
		ContaCorrente cc4 = new ContaCorrente(c4);
		cc4.deposito(520.0);
		banco.addContas(cc4);

		for (Conta conta1 : banco.getContas()) {
			// System.out.println(conta1.getCliente().getNome() + " " +
			// conta1.getSaldo());
			System.out.println(conta1.getCliente().getNome() + " = " + conta1.getSaldo());
		}

	}

}
