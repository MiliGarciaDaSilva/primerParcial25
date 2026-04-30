package ucu.edu.aed;

import ucu.edu.aed.modelo.Dron;
import ucu.edu.aed.sistema.Gestion;

public class Main {
  public static void main(String[] args) {
    Gestion gestion = new Gestion();
    Dron dron = new Dron(100, 100, 10);
    
    gestion.agregarEstacion(72);
    gestion.agregarEstacion(9);
    gestion.agregarEstacion(68);
    gestion.agregarEstacion(120);
    gestion.agregarEstacion(55);
    gestion.agregarEstacion(63);
    gestion.agregarEstacion(80);

    System.out.println(gestion.recorrer(dron));
  }
}
