package pe.egcc.pagoapp.service;

import pe.egcc.pagoapp.dto.PagoDto;

public class PagoService {

  public void procesar(PagoDto dto){
    // Validar
    if(dto.getHorasDia() <= 0){
      throw new RuntimeException("Las horas por días debe ser mayor que cero.");
    }
    if(dto.getDias() <= 0){
      throw new RuntimeException("Los días trabajados debe ser mayor que cero.");
    }
    if(dto.getPagoHora()<= 0.0){
      throw new RuntimeException("El pago por hora debe ser mayor que cero.");
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

  
}
