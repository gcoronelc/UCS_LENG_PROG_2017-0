package pe.egcc.cuerposano.service;

import pe.egcc.cuerposano.model.Servicio;
import pe.egcc.cuerposano.model.Venta;

public class ClinicaService {

  // Tipos Clientes
  public final String CLIE_SOAT = "SOAT";
  public final String CLIE_SALUD = "SALUD";
  public final String CLIE_NORMAL = "NORMAL";

  // Servicios
  private final Servicio[] servicios;

  public ClinicaService() {
    servicios = new Servicio[]{
      new Servicio("Consulta ambulatoria", 90, 80, 15, 0),
      new Servicio("Consulta emergencia", 90, 80, 15, 0),
      new Servicio("Medicina genérica", 95, 85, 20, 0),
      new Servicio("Medicina de marca", 80, 75, 15, 0),
      new Servicio("Medicina oncológica", 60, 50, 10, 0),
      new Servicio("Laboratorio", 100, 90, 10, 0),
      new Servicio("Otros", 60, 50, 5, 0)
    };
  }

  public Servicio[] getServicios() {
    return servicios;
  }

  public String[] getTiposCliente() {
    String[] tipos = {CLIE_SOAT, CLIE_SALUD, CLIE_NORMAL};
    return tipos;
  }

  public void procesarServicio(Venta venta) {
    // Variables
    double porcDcto, importe, descuento, subtotal, impuesto, total;
    // Porc. de descuento
    porcDcto = 0.0;
    switch (venta.getTipoCliente()) {
      case CLIE_SOAT:
        porcDcto = venta.getServicio().getSoat();
        break;
      case CLIE_SALUD:
        porcDcto = venta.getServicio().getSalud();
        break;
      case CLIE_NORMAL:
        if (venta.isFrecuente()) {
          porcDcto = venta.getServicio().getFrecuente();
        } else {
          porcDcto = venta.getServicio().getNoFrecuenta();
        }
        break;
    }
    // Otros calculos
    importe = venta.getPrecio() * venta.getCantidad();
    descuento = importe * porcDcto / 100;
    total = importe - descuento;
    subtotal = total / 1.18;
    impuesto = total - subtotal;
    // Reporte
    venta.setImporte(importe);
    venta.setDescuento(descuento);
    venta.setSubtotal(subtotal);
    venta.setImpuesto(impuesto);
    venta.setTotal(total);
  }

}
