package pe.egcc.rentacurso.dto;

public class Categoria {

  private String nombre;
  private double costoCurso;
  private double pagoHora;

  public Categoria() {
  }

  public Categoria(String nombre, double costoCurso, double pagoHora) {
    this.nombre = nombre;
    this.costoCurso = costoCurso;
    this.pagoHora = pagoHora;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getCostoCurso() {
    return costoCurso;
  }

  public void setCostoCurso(double costoCurso) {
    this.costoCurso = costoCurso;
  }

  public double getPagoHora() {
    return pagoHora;
  }

  public void setPagoHora(double pagoHora) {
    this.pagoHora = pagoHora;
  }

  @Override
  public String toString() {
    return nombre;
  }

}
