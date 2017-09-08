package cuentasBancarias;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("unused")
public class CuentasTest {

	
	@Test
	public void queConstruya() {
		CuentaBancaria cuenta = new CuentaBancaria();
	}
	
	@Test
	public void queConstruyaConParametro() {
		CuentaBancaria cuenta = new CuentaBancaria(5000);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void queConstruyaConSaldoNegativo() {
		CuentaBancaria cuenta = new CuentaBancaria(-5000);
	}
	
	@Test
	public void queObtieneSaldo() {
		CuentaBancaria cuenta = new CuentaBancaria(5000);
		Assert.assertTrue(5000 == cuenta.getSaldo());
	}
	
	@Test
	public void queTransfiereMonto() {
		CuentaBancaria cuentaOrigen = new CuentaBancaria(5000);
		CuentaBancaria cuentaDestino = new CuentaBancaria(5000);
		Assert.assertTrue(cuentaOrigen.transferirMontoHacia(2500, cuentaDestino));
		Assert.assertTrue(2500 == cuentaOrigen.getSaldo());
	}
}
