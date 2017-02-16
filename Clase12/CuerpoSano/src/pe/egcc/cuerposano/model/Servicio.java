package pe.egcc.cuerposano.model;

public class Servicio {

  private String nombre;
  private double soat;
  private double salud;
  private double frecuente;
  private double noFrecuenta;

  public Servicio() {
  }

  public Servicio(String nombre, double soat, double salud, double frecuente, double noFrecuenta) {
    this.nombre = nombre;
    this.soat = soat;
    this.salud = salud;
    this.frecuente = frecuente;
    this.noFrecuenta = noFrecuenta;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getSoat() {
    return soat;
  }

  public void setSoat(double soat) {
    this.soat = soat;
  }

  public double getSalud() {
    return salud;
  }

  public void setSalud(double salud) {
    this.salud = salud;
  }

  public double getFrecuente() {
    return frecuente;
  }

  public void setFrecuente(double frecuente) {
    this.frecuente = frecuente;
  }

  public double getNoFrecuenta() {
    return noFrecuenta;
  }

  public void setNoFrecuenta(double noFrecuenta) {
    this.noFrecuenta = noFrecuenta;
  }

  @Override
  public String toString() {
    return nombre;
  }

}
