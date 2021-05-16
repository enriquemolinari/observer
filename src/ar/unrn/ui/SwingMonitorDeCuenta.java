package ar.unrn.ui;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ar.unrn.model.Observer;


public class SwingMonitorDeCuenta implements Observer {
	private JLabel label;

//	public void nuevoMonto(String data) {
//		label.setText(data); 
//	}

	public SwingMonitorDeCuenta() {
		JFrame frame = new JFrame("Monitor");
		frame.getRootPane().setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		label = new JLabel("...");
		label.setFont(new Font("Dialog", Font.PLAIN, 20));
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		frame.setLocation(200, 200);
		frame.setVisible(true);
	}

	@Override
	public void actualizar(String valor) {
		label.setText(valor);
	}
}