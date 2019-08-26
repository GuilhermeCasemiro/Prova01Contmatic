package br.com.contmatic.prova01Guilherme.Prova;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import br.com.contmatic.enums.DDD;
import br.com.contmatic.enums.Telefone;

public class Contato {
	
	Telefone telefone;
	DDD ddd;

	public Contato() {
		super();
	}

	public Contato(Telefone telefone, DDD ddd) {
		super();
		this.telefone = telefone;
		this.ddd = ddd;
	}
	

	@Valid
	
	@Size(max = 9)
	public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Valid
    @Max(2)
    public DDD getDdd() {
        return ddd;
    }

    public void setDdd(DDD ddd) {
        this.ddd = ddd;
    }

    @Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.JSON_STYLE).append("Telefone", telefone).append("DDD", ddd).toString();
	}

}
