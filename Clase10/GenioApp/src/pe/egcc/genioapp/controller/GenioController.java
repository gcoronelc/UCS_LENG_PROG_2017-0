package pe.egcc.genioapp.controller;

import pe.egcc.genioapp.service.MyMath;

public class GenioController {

  public long factorial(int num) {
    return MyMath.factorial(num);
  }
  
}
