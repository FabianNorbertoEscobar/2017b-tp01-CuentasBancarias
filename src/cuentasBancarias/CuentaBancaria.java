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

	public boolean transferirMontoHacia(double monto, CuentaBancaria cuentaDestino) {
		if (this.saldo < monto) {
			return false;
		} else {
			this.quitarMonto(monto);
			cuentaDestino.agregarMonto(monto);
			return true;
		}
	}
	

	private void quitarMonto(double monto) {
		this.saldo -= monto;
	}

	
	private void agregarMonto(double monto) {
		this.saldo += monto;
	}

}
