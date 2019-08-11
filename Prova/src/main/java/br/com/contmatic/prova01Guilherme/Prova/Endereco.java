package br.com.contmatic.prova01Guilherme.Prova;

public class Endereco {
	String bairo;
	String uf;
	String cep;

	public Endereco() {
		super();
	}

	public Endereco(String bairo, String uf, String cep) {
		super();
		this.bairo = bairo;
		this.uf = uf;
		this.cep = cep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairo == null) ? 0 : bairo.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
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
		Endereco other = (Endereco) obj;
		if (bairo == null) {
			if (other.bairo != null)
				return false;
		} else if (!bairo.equals(other.bairo))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Endereco [bairo=" + bairo + ", uf=" + uf + ", cep=" + cep + "]";
	}

}
