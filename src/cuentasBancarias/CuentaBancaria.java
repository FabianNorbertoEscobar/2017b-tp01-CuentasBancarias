package cuentasBancarias;

public class CuentaBancaria {

	private double saldo;

	public CuentaBancaria() {
		this.saldo = 0;
	}

	public CuentaBancaria(double saldo) {
		if (saldo < 0) {
			throw new IllegalArgumentException();
		}
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
