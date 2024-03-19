package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CuentaBancariaTest {
	@Test
	void titular() {
		CuentaBancaria c1 = new CuentaBancaria("Marcos", 22.2);
		assertEquals("Marcos", c1.getTitular());
	}
	
	@Test
	void saldoini() {
		CuentaBancaria c1 = new CuentaBancaria("Marcos", 22.2);
		assertEquals(22.2, c1.getSaldo());
	}
	
	@ParameterizedTest
	@CsvSource({
			"2.0,    4.0",
			"5.0,    7.0",
			"8.0,  10.0",
			"10.0,  12.0"
	})
	void depo(double first, double expectedResult) {
		CuentaBancaria c1 = new CuentaBancaria("Marcos", 2.0);
		c1.depositar(first);
		assertEquals(expectedResult, first + 2.0);
	
	}
	
	@ParameterizedTest
	@CsvSource({
		"5.0,    5.0",
		"7.0,    3.0",
		"2.0,  8.0",
		"9.0, 1.00" })

void reti(double first, double expectedResult) {
	CuentaBancaria c1 = new CuentaBancaria("Marcos", 10.0);
	c1.retirar(first);
	assertEquals(expectedResult, 10.0 - first);

}

	
	
	
	
}
