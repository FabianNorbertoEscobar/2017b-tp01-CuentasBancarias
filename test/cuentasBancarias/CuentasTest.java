package cuentasBancarias;

import org.junit.Test;

public class CuentasTest {

	/*
	@Test
	public void queConstruya() {
		CuentaBancaria cuenta = new CuentaBancaria();
	}
	*/
	
	@Test
	public void queConstruyaConParametro() {
		CuentaBancaria cuenta = new CuentaBancaria(5000);
	}
}
