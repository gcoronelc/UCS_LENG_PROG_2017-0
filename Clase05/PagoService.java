
package pe.egcc.pagoapp.service;

import pe.egcc.pagoapp.dto.PagoDto;

public class PagoService {
    
    public void procesar(PagoDto dto){
        //validar
        if(dto.getPagoHora()<=0 && dto.getHorasDia()<=0 && dto.getDias()<=0){
            throw new RuntimeException("El pago por hora, los dias trabajados y las horaspor dias deben ser mayor que cero");
        }
        if(dto.getHorasDia()<=0 && dto.getDias()<=0){
            throw new RuntimeException("Los dias trabajados y las horaspor dias deben ser mayor que cero");
        }
        if(dto.getPagoHora()<=0 && dto.getDias()<=0){
            throw new RuntimeException("El pago por hora, las horaspor dias deben ser mayor que cero");
        }
        else if(dto.getPagoHora()<=0 && dto.getHorasDia()<=0){
            throw new RuntimeException("El pago por hora, los dias trabajados deben ser mayor que cero");
        }
        else if(dto.getHorasDia()<=0){
            throw new RuntimeException("Las horas por dias debe ser mayor que cero");
        }
        else if(dto.getDias()<=0){
            throw new RuntimeException("Los dias trabajados deben ser mayor que cero");
        }
        else if(dto.getPagoHora()<=0){
            throw new RuntimeException("El pago por hora debe ser mayor que cero");
        }
        
        //variables
        double ingresos, renta, neto;
        //proceso
        ingresos = dto.getHorasDia()*dto.getDias()*dto.getPagoHora();
        if(ingresos > 1500){
            renta=0.08*ingresos;
        }else{
            renta=0.0;
        }
        neto=ingresos - renta;
        //Reporte
        dto.setIngresos(ingresos);
        dto.setRenta(renta);
        dto.setNeto(neto);
    }
}
