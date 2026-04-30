package ucu.edu.aed.sistema;

import ucu.edu.aed.modelo.Dron;
import ucu.edu.aed.modelo.Estacion;
import ucu.edu.aed.tda.AVLArbol;

public class Gestion {
  public AVLArbol<Estacion> red;

  public Gestion(){
    red = new AVLArbol<Estacion>();
  }

  public void agregarEstacion(Estacion estacion){
    red.insertar(estacion);
  }

  public String recorrer(Dron dron){
    red.preOrder(estacion -> {
        if (dron.getActual() <= 0 && dron.getEstado() == null) {
          dron.setEstado("BateriaAgotada");
        }else if("recargar" == estacion.getAccion()){
            dron.actualizarCarga(dron.getCargaMaxima());
        } else if("falla" == estacion.getAccion() && dron.getEstado() == null){
            dron.setEstado("FallaNavegacion");
        }
        else if(null == estacion.getAccion()){
          dron.actualizarCarga(-dron.getConsumo());
        }
    });
    if (dron.getEstado() != null) {
    return dron.getEstado();
    }else{
      return "CompletaRuta";
    }
  }
}
