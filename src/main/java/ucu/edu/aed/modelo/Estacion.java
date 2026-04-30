package ucu.edu.aed.modelo;

public class Estacion implements Comparable<Estacion>{
  public int senal;
  public String accion = null;

  public Estacion(int senal){
    this.senal = senal;
    if (60<senal && senal>80) {
      this.accion = "recargar";
    }else if(senal <= 10 || senal > 100){
      this.accion = "falla";
    }
  }

  @Override
  public int compareTo(Estacion otraEstacion) {
    return Integer.compare(this.senal, otraEstacion.senal);
  }

  public String getAccion() {
    return this.accion;
  }
}
