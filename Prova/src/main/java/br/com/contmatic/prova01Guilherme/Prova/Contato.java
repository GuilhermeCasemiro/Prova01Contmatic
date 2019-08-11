package br.com.contmatic.prova01Guilherme.Prova;

public class Contato {
	int telefone;
	int ddd;

	public Contato() {
		super();
	}

	public Contato(int telefone, int ddd) {
		super();
		this.telefone = telefone;
		this.ddd = ddd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ddd;
		result = prime * result + telefone;
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
		Contato other = (Contato) obj;
		if (ddd != other.ddd)
			return false;
		if (telefone != other.telefone)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contato [telefone=" + telefone + ", ddd=" + ddd + "]";
	}

}
