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

	public double deposita(double quantidade) {
		double novoSaldo = quantidade;
		this.saldoConta += novoSaldo;
		return this.saldoConta;
	}

	public double transferePara(Conta destino, double valor) {
		this.saldoConta -= valor;
		destino.saldoConta += valor;
		return destino.saldoConta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroConta;
		long temp;
		temp = Double.doubleToLongBits(saldoConta);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titularConta == null) ? 0 : titularConta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numeroConta != other.numeroConta)
			return false;
		if (Double.doubleToLongBits(saldoConta) != Double.doubleToLongBits(other.saldoConta))
			return false;
		if (titularConta == null) {
			if (other.titularConta != null)
				return false;
		} else if (!titularConta.equals(other.titularConta))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("Numero da conta: %s , Titular: %s, Saldo da conta: $.2f", numeroConta, titularConta,saldoConta);
	}
}
