package pe.egcc.cuerposano.prueba;

import pe.egcc.cuerposano.model.Venta;
import pe.egcc.cuerposano.service.ClinicaService;

public class Prueba01 {
  
  public static void main(String[] args) {
    // El componente de servicios
    ClinicaService service = new ClinicaService();
    // Datos
    Venta venta = new Venta();
    venta.setTipoCliente(service.CLIE_NORMAL);
    venta.setFrecuente(false);
    venta.setServicio(service.getServicios()[0]);
    venta.setDescripcion("Algo");
    venta.setPrecio(50.0);
    venta.setCantidad(10);
    // Proceso
    service.procesarServicio(venta);
    // Reporte
    System.out.println("Servicio: " + venta.getServicio().getNombre());
    System.out.println("Descripción: " + venta.getDescripcion());
    System.out.println("Precio: " + venta.getPrecio());
    System.out.println("Cantidad: " + venta.getCantidad());
    System.out.println("Importe: " + venta.getImporte());
    System.out.println("Descuento: " + venta.getDescuento());
    System.out.println("Subtotal: " + venta.getSubtotal());
    System.out.println("Impuesto: " + venta.getImpuesto());
    System.out.println("Total: " + venta.getTotal());
  }
  
}
