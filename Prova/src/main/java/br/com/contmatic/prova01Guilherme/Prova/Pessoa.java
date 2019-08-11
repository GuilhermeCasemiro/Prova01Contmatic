package br.com.contmatic.prova01Guilherme.Prova;

import java.util.List;

public class Pessoa {
	String endereço;
	String contato;
	String email;
	Endereco endereco;
	List<Contato> contatos;

	public Pessoa() {
		super();
	}

	public Pessoa(String endereço, String contato, String email, Endereco endereco, List<Contato> contatos) {
		super();
		this.endereço = endereço;
		this.contato = contato;
		this.email = email;
		this.endereco = endereco;
		this.contatos = contatos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contato == null) ? 0 : contato.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (contato == null) {
			if (other.contato != null)
				return false;
		} else if (!contato.equals(other.contato))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereço == null) {
			if (other.endereço != null)
				return false;
		} else if (!endereço.equals(other.endereço))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [endereço=" + endereço + ", contato=" + contato + ", email=" + email + ", endereco=" + endereco
				+ ", contatos=" + contatos + "]";
	}

}
