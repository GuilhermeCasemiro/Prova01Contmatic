package br.com.contmatic.prova01Guilherme.Prova;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import br.com.contmatic.exceptions.SaldoInsuficienteException;

@RunWith(JUnit4.class)
public class ContaTeste {
	Conta c = new Conta();
	Conta destino = new Conta();

	@DisplayName("Teste para saber se o objeto não é nulo.")
	@BeforeAll
	@Order(1)
	public static void TesteParaConta() {
		
	}

	@AfterEach
	@DisplayName("Teste com um valor para saque.")
	@Order(2)
	public void testeParaSaque() {

		assert (c.saca(700));
	}

	@BeforeEach
	@DisplayName("Teste repetido (5x) para ver se o nome é igual ao informado.")
	@Test
	@Order(3)
	@RepeatedTest(5)
	public void testeParaNome() {
		String nomeUsuario = c.cliente.nome;
		assertEquals("Guilherme", nomeUsuario);
	}

	@DisplayName("Teste com um array de valores para a classe de erro.")
	@Order(4)
	@ParameterizedTest
	@ValueSource(doubles = { 2000, 3000, 3500 })
	public void TesteParaException(double valor) {
		assertThrows(SaldoInsuficienteException.class, () -> {
			c.saca(valor);
		});
	}

	@DisplayName("Teste com varios valores pra deposito..")
	@ParameterizedTest
	@ValueSource(doubles = { 700, 100.50, 350.75 })
	public void testeParaDeposito(double valor) {
		double saldoFinal = c.saldoConta += valor;
		assertThat(saldoFinal, is(c.saldoConta));

	}

	@Disabled("Ainda não esta pronto pra teste.")
	public void testeParaTransferir() {

		double valor = 700;
		c.saldoConta -= valor;
		destino.saldoConta += valor;
	}

	@AfterAll
	@DisplayName("Teste com Timeout pra ver se a execução de todos os metodos levam mais de 1s.")
	public static void testeParaTimeout() {
		assertTimeout(Duration.ofMillis(10), () -> {
			TesteParaConta();
		});
	}

}