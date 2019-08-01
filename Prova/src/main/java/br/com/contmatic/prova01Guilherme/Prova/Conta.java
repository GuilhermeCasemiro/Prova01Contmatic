package br.com.contmatic.prova01Guilherme.Prova;

public class Conta {
	int numeroConta;
	String titularConta;
	double saldoConta;
	
	

	public Conta() {
		super();
		this.numeroConta = 1;
		this.saldoConta = 100;
		this.titularConta = "";
	}

	public void saca(double quantidade) {
		if (quantidade > this.saldoConta) {
			System.out.println("Saldo indisponível");
		} else {
			this.saldoConta -= quantidade;
		}
	}

	public void deposita(double quantidade) {
		double novoSaldo = quantidade;
		this.saldoConta = novoSaldo;
	}

	public void transferePara(Conta destino, double valor) {

	}
}
