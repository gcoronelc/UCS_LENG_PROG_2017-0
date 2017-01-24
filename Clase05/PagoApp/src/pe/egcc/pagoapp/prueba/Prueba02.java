package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

public class Prueba02 {

  public static void main(String[] args) {
    
    try {
      // Dato
      PagoDto dto = new PagoDto(-6, 20, -80.0);
      // Proceso
      PagoService service = new PagoService();
      service.procesar(dto);
      // Reporte
      System.out.println("Ingresos: " + dto.getIngresos());
      System.out.println("Renta: " + dto.getRenta());
      System.out.println("Neto: " + dto.getNeto());
    } catch (Exception e) {
      System.err.println("Error:\n" + e.getMessage());
    }
    
    
  }
  
}
