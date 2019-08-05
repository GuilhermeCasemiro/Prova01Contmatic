package br.com.contmatic.prova01Guilherme.Prova;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class ContaTeste {
	
	Conta c = new Conta();
	
	@Test
	public void TesteDeposita() {
		c.numeroConta = 1;
		c.saldoConta = 5000;
		c.titularConta = "Guilherme";
		
		assertEquals(7000, c.deposita(1000), 0);
	}
	@Test
	public void TesteSaca() {
		c.numeroConta = 1;
		c.saldoConta = 5000;
		c.titularConta = "Guilherme";
//		assertThat(5000, is(c.saldoConta));
	}
	
}
