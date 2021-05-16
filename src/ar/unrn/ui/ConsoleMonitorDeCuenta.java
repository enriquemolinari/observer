package ar.unrn.ui;

import ar.unrn.model.Observer;

public class ConsoleMonitorDeCuenta implements Observer {

	@Override
	public void actualizar(String valor) {
		System.out.println(valor);		
	}

}
