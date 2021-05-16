package ar.unrn.ui;

import java.util.List;

import javax.swing.SwingUtilities;

public class Main {

 public static void main(String[] args) {
  SwingUtilities.invokeLater(new Runnable() {
   @Override
   public void run() {
    new Main().start();
   }
  });
 }

 private void start() {
  new Cajero(
    List.of(new SwingMonitorDeCuenta(), new ConsoleMonitorDeCuenta()))
      .iniciar();
 }
}
