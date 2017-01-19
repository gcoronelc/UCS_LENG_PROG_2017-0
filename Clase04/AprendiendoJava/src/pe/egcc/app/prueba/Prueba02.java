package pe.egcc.app.prueba;

import pe.egcc.app.model.Producto;

public class Prueba02 {

  public static void main(String[] args) {
    
    Producto obj = new Producto("Televisor",500,2500.0,true);
    
    mostrar( obj );
    
  }

  private static void mostrar(Producto obj) {
    System.out.println("---------------------");
    System.out.println("Nombre: " + obj.getNombre());
    System.out.println("Stock: " + obj.getStock());
    System.out.println("Precio: " + obj.getPrecio());
    System.out.println("Activo: " + obj.isActivo());
  }
  
}
