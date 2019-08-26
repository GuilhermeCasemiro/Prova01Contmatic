package br.com.contmatic.prova01Guilherme.Prova;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import br.com.contmatic.enums.DDD;

public class Endereco {
    private String bairro;
    private DDD uf;
    private String cep;

    public Endereco() {
        super();
    }

    public Endereco(String bairro, DDD uf, String cep) {
        super();
        this.bairro = bairro;
        this.uf = uf;
        this.cep = cep;
    }

    @Size(min = 5, max = 30)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Size(max = 2)
    public DDD getUf() {
        return uf;
    }

    public void setUf(DDD uf) {
        this.uf = uf;
    }

    @NotNull
    @Pattern(regexp = "^\\d{5}-\\d{3}$")
    @Max(8)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE).append("Bairro", bairro).append("UF", uf).append("CEP", cep).toString();
    }

}
