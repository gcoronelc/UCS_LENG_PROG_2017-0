package pe.egcc.pagoapp.service;

import pe.egcc.pagoapp.dto.PagoDto;

public class PagoService {

  public void procesar(PagoDto dto){
    // Validar
    String mensaje = "";
    if(dto.getHorasDia() <= 0){
      mensaje = addStr(mensaje,"Las horas por días debe ser mayor que cero.");
    }
    if(dto.getDias() <= 0){
      mensaje = addStr(mensaje,"Los días trabajados debe ser mayor que cero.");
    }
    if(dto.getPagoHora()<= 0.0){
      mensaje = addStr(mensaje,"El pago por hora debe ser mayor que cero.");
    }
    if(mensaje.length() > 0){
      throw  new RuntimeException(mensaje);
    }
    
    // Variables
    double ingresos, renta, neto;
    // Proceso
    ingresos = dto.getHorasDia() * dto.getDias() * dto.getPagoHora();
    if(ingresos > 1500.0){
      renta = 0.08 * ingresos;
    } else {
      renta = 0.0;
    }
    neto = ingresos - renta;
    // Reporte
    dto.setIngresos(ingresos);
    dto.setRenta(renta);
    dto.setNeto(neto);
  }

  private String addStr(String mensaje, String texto) {
    if(mensaje.length() == 0){
      mensaje = texto;
    } else {
      mensaje += "\n" + texto;
    }
    return mensaje;
  }

  
}
