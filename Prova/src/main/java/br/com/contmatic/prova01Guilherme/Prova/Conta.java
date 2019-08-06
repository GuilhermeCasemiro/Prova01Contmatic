package br.com.contmatic.prova01Guilherme.Prova;

import br.com.contmatic.exceptions.SaldoInsuficienteException;

public class Conta {
	int numeroConta;
	Cliente cliente = new Cliente();
	double saldoConta;
	
	public Conta() {
		super();
		this.numeroConta = 100;
		this.saldoConta = 1100;
	}

	public boolean saca(double quantidade) {
		if (quantidade > this.saldoConta) {
			throw new SaldoInsuficienteException("Saldo Insuficiente.");
		} else {
			this.saldoConta -= quantidade;
			return true;
		}
		
	}

	public double deposita(double quantidade) {
		double novoSaldo = quantidade;
		this.saldoConta += novoSaldo;
		return this.saldoConta;
	}

	public boolean transferePara(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou) {
			System.out.println("Saldo Insuficiente");
			return false;
		}
		else {
			destino.deposita(valor);
			return true;
		}
	}
	
}
