package br.com.contmatic.prova01Guilherme.Prova;

import java.util.Date;

public class PessoaFisica extends Pessoa{
	String nome;
	String cpf;
	String sexo;
	Date dataNascimento;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String cpf, String sexo, Date dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		PessoaFisica other = (PessoaFisica) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PessoaFisica [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento
				+ "]";
	}

}
