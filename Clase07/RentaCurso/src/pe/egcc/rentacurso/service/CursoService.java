package pe.egcc.rentacurso.service;

import pe.egcc.rentacurso.dto.Categoria;
import pe.egcc.rentacurso.dto.CursoDto;

public class CursoService {

  // Datos de Cursos
  private final String[] cursos = {
    "Desarrollo Web con PHP",
    "Desarrollo Web con Java",
    "Desarrollo con Spring Framework",
    "Desarrollo con Angular y REST"
  };

  // Datos de Categorías
  private final Categoria[] categorias = {
    new Categoria("Basico", 500.0, 60.0),
    new Categoria("Intermedio", 700.0, 80.0),
    new Categoria("Avanzado", 900.0, 100.0),};

  // Horas de duración
  private final int horas = 30;

  public String[] getCursos() {
    return cursos;
  }

  public Categoria[] getCategorias() {
    return categorias;
  }

  public void procesar(CursoDto dto) {
    // Variables
    double ingresos, publicidad, logistica;
    double materiales, profesor, rentabilidad;
    // Proceso
    ingresos = dto.getCategoria().getCostoCurso() * dto.getVacantes();
    publicidad = ingresos * 0.07;
    logistica = ingresos * 0.08;
    materiales = ingresos * 0.06;
    profesor = horas * dto.getCategoria().getPagoHora();
    rentabilidad = ingresos - publicidad
            - logistica - materiales - profesor;
    // Reporte
    dto.setIngresos(ingresos);
    dto.setPublicidad(publicidad);
    dto.setLogistica(logistica);
    dto.setMateriales(materiales);
    dto.setProfesor(profesor);
    dto.setRentabilidad(rentabilidad);
  }

}
