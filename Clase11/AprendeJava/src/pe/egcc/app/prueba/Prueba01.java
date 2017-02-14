package pe.egcc.app.prueba;

import pe.egcc.app.model.Venta;

/**
 *
 * @author Administrador
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    
    System.out.println("igv: " + Venta.igv);
    
    Venta o1 = new Venta();
    o1.cliente = "Gustavo";
    o1.importe = 5000.0;
    o1.igv = 0.30;
        
    Venta o2 = new Venta();
    o2.cliente = "Claudia";
    o2.importe = 15000.0;
    o2.igv = 0.25;
    
    mostrar(o1);
    mostrar(o2);
        
  }

  private static void mostrar(Venta o) {
    System.out.println("------------------------------");
    System.out.println("Cliente: " + o.cliente);
    System.out.println("Importe: " + o.importe);
    System.out.println("IGV: " + o.igv);
  }
  
}
