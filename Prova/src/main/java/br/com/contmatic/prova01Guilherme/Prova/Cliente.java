package br.com.contmatic.prova01Guilherme.Prova;

import br.com.contmatic.exceptions.NomeInvalidoException;

public class Cliente {
	String nome;
	String sobrenome;
	String cpf;

	public Cliente() {
		super();
		this.nome = "Guilherme";
		this.sobrenome = "Casemiro";
		this.cpf = "51082160091";
	}
	
	public String validaNome(String nome, String sobrenome) {
		if (nome == null && nome.isEmpty() && nome.length() < 3
				&& sobrenome == null && sobrenome.isEmpty() && sobrenome.length() < 5) {
			
			throw new NomeInvalidoException("Nome e sobrenome não pode estar vazio ou ter menos de 3 caracteres.");
		}
		else {
			return String.format("Nome Completo: %s %s", nome, sobrenome);
		}
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
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
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		return String.format("Nome Completo: %s %s\nCPF: %s", nome, sobrenome, cpf);
	}

}
