package ucu.edu.aed.modelo;

public class Dron {
  public int cargaActual;
  public int cargaMaxima;
  public int consumo;
  public String estado = null;
  
  public Dron(int inicial, int maxima, int consumo){
    this.cargaActual = inicial;
    this.cargaMaxima = maxima;
    this.consumo = consumo;
  }

  public int getActual(){
    return this.cargaActual;
  }

  public void actualizarCarga(int carga){
    if (this.cargaActual + carga > 100) {
      this.cargaActual = this.cargaMaxima;
    }else{
    this.cargaActual += carga;
    }
  }

  public String getEstado(){
    return this.estado;
  }

  public void setEstado(String nuevo){
    this.estado = nuevo;
  }

  public int getConsumo(){
    return this.consumo;
  }

  public int getCargaMaxima() {
    return this.cargaMaxima;
  }
}
