package cuentasBancarias;

import org.junit.Assert;
import org.junit.Test;

public class CuentasTest {

	
	@Test
	public void queConstruya() {
		CuentaBancaria cuenta = new CuentaBancaria();
	}
	
	@Test
	public void queConstruyaConParametro() {
		CuentaBancaria cuenta = new CuentaBancaria(5000);
	}
	
	@Test
	public void queObtieneSaldo() {
		CuentaBancaria cuenta = new CuentaBancaria(5000);
		Assert.assertEquals(5000.00, cuenta.getSaldo());
	}
}
