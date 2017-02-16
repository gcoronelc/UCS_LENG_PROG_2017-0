package pe.egcc.cuerposano.model;

public class Venta {

  // Datos
  private String tipoCliente;
  private boolean frecuente;
  private Servicio servicio;
  private double precio;
  private double cantidad;
  private String descripcion;
  // Resultado
  private double importe;
  private double descuento;
  private double subtotal;
  private double impuesto;
  private double total;

  public Venta() {
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getDescripcion() {
    return descripcion;
  }
  
  public String getTipoCliente() {
    return tipoCliente;
  }

  public void setTipoCliente(String tipoCliente) {
    this.tipoCliente = tipoCliente;
  }

  public boolean isFrecuente() {
    return frecuente;
  }

  public void setFrecuente(boolean frecuente) {
    this.frecuente = frecuente;
  }

  public Servicio getServicio() {
    return servicio;
  }

  public void setServicio(Servicio servicio) {
    this.servicio = servicio;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public double getCantidad() {
    return cantidad;
  }

  public void setCantidad(double cantidad) {
    this.cantidad = cantidad;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  public double getDescuento() {
    return descuento;
  }

  public void setDescuento(double descuento) {
    this.descuento = descuento;
  }

  public double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(double subtotal) {
    this.subtotal = subtotal;
  }

  public double getImpuesto() {
    return impuesto;
  }

  public void setImpuesto(double impuesto) {
    this.impuesto = impuesto;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

}
