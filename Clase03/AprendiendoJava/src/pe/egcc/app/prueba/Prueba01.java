package pe.egcc.app.prueba;

import pe.egcc.app.model.Producto;

public class Prueba01 {

  public static void main(String[] args) {
    
    Producto obj = new Producto();
    
    mostrar( obj );
    
    obj.setNombre("Coca Cola");
    obj.setStock(1000);
    obj.setPrecio(3.0);
    obj.setActivo(true);
    
    mostrar(obj);
  }

  private static void mostrar(Producto obj) {
    System.out.println("---------------------");
    System.out.println("Nombre: " + obj.getNombre());
    System.out.println("Stock: " + obj.getStock());
    System.out.println("Precio: " + obj.getPrecio());
    System.out.println("Activo: " + obj.isActivo());
  }
  
}
