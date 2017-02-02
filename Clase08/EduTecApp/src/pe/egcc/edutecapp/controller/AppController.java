package pe.egcc.edutecapp.controller;

import pe.egcc.edutec.service.MateService;

/**
 *
 * @author Administrador
 */
public class AppController {

  private MateService service;

  public AppController() {
    service = new MateService();
  }

  public int promedio(int n1, int n2) {
    return service.promedio(n1, n2);
  }

}
