package pe.egcc.cuerposano.controller;

import pe.egcc.cuerposano.model.Servicio;
import pe.egcc.cuerposano.model.Venta;
import pe.egcc.cuerposano.service.ClinicaService;

public class VentaController {

  private ClinicaService service;

  public VentaController() {
    service = new ClinicaService();
  }
  
  public String[] getTipos(){
    return service.getTiposCliente();
  }
  
  public Servicio[] getServicios(){
    return service.getServicios();
  }

  public void procesar(Venta venta) {
    service.procesarServicio(venta);
  }
  
}
