package pe.egcc.genioapp.prueba;

import pe.egcc.genioapp.service.MyMath;

public class Prueba01 {

  public static void main(String[] args) {
    for(int i=0; i <= 10; i++){
      System.out.println("Factorial de " + i + " es " + MyMath.factorial(i));
    }
  }
  
}
