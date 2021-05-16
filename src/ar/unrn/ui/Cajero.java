package ar.unrn.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import ar.unrn.model.CuentaBancaria;
import ar.unrn.model.Observer;

public class Cajero {

	private List<Observer> monitores;

	Cajero(List<Observer> monitores) {
		this.monitores = monitores;
	}

	public void iniciar() {
		CuentaBancaria cuenta = new CuentaBancaria(2000, monitores);

		JFrame dialog = new JFrame("Cajero Automático");
		JButton button = new JButton("Depositar $1000");
		button.setFont(new Font("Dialog", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cuenta.depositar(1000);
				// monitor.nuevoMonto(cuenta.saldo());
			}
		});

		dialog.add(button);
		dialog.setSize(250, 150);
		dialog.setLocation(600, 200);
		dialog.setVisible(true);

	}

}