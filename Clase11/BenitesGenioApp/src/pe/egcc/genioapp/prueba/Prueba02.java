package pe.egcc.genioapp.prueba;

import pe.egcc.genioapp.service.MyMath;

public class Prueba02 {

  public static void main(String[] args) {
    int[] repo = MyMath.fibonacci(8);
    for (int n : repo) {
      System.out.print(n + "\t");
    }
  }
  
}
