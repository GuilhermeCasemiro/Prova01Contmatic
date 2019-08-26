package br.com.contmatic.prova01Guilherme.Prova;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Pessoa {

    private String nome;
    private String email;
    private Set<Endereco> endereco;
    private Set<Contato> contatos;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, String email, Set<Endereco> endereco, Set<Contato> contatos) {
        super();
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.contatos = contatos;
    }

    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 3, max = 30)
    @Pattern(regexp = "/^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$/") // Pode conter letras maiusculas e minusculas e com acentuação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Email
    @NotEmpty(message = "E-mail é obrigatório")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotNull(message = "Endereço é obrigatório.")
    @Valid
    public Set<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(HashSet<Endereco> endereco) {
        this.endereco = endereco;
    }

    @Valid
    @NotNull
    public Set<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(HashSet<Contato> contatos) {
        this.contatos = contatos;
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

        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE).append("Nome", nome).append("E-mail", email).append("Endereco", endereco).append("Contatos", contatos).toString();

    }

}
