package ar.unrn.model;

import java.util.List;

public class CuentaBancaria extends Observable {

	private double monto;
	
	public CuentaBancaria(double monto, List<Observer> monitores) {
		this.monto = monto;
        for (Observer observer : monitores) {
         this.agregarObservador(observer);
     }	
	}
	
	public void depositar(double monto) {
		this.monto += monto;
		this.notificar(this.saldo());
	}
	
	private String saldo() {
		return "$" + monto;
	}
}
