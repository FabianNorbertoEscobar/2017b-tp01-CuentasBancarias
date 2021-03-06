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
		Assert.assertTrue(7500 == cuentaDestino.getSaldo());
	}
	
	@Test
	public void queNoTransfiereMontoSiSaldoInsuficiente() {
		CuentaBancaria cuentaOrigen = new CuentaBancaria(2500);
		CuentaBancaria cuentaDestino = new CuentaBancaria(5000);
		Assert.assertFalse(cuentaOrigen.transferirMontoHacia(5000, cuentaDestino));
		Assert.assertTrue(2500 == cuentaOrigen.getSaldo());
		Assert.assertTrue(5000 == cuentaDestino.getSaldo());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void queNoTransfiereMontoNegativo() {
		CuentaBancaria cuentaOrigen = new CuentaBancaria(5000);
		CuentaBancaria cuentaDestino = new CuentaBancaria(5000);
		Assert.assertTrue(cuentaOrigen.transferirMontoHacia(-2500, cuentaDestino));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void queNoTransfiereMontoNulo() {
		CuentaBancaria cuentaOrigen = new CuentaBancaria(5000);
		CuentaBancaria cuentaDestino = new CuentaBancaria(5000);
		Assert.assertTrue(cuentaOrigen.transferirMontoHacia(0, cuentaDestino));
	}
	
}
