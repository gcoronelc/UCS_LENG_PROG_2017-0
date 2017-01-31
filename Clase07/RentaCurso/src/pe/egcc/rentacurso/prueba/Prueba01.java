package pe.egcc.rentacurso.prueba;

import pe.egcc.rentacurso.dto.Categoria;
import pe.egcc.rentacurso.dto.CursoDto;
import pe.egcc.rentacurso.service.CursoService;

public class Prueba01 {

  public static void main(String[] args) {
    // Objeto de Servicios
    CursoService service = new CursoService();
    // Datos
    String curso = service.getCursos()[2];
    Categoria cate = service.getCategorias()[1];
    int vacantes = 20;
    CursoDto dto = new CursoDto(curso, cate, vacantes);
    // Proceso
    service.procesar(dto);
    // Reporte
    System.out.println("Curso: " + dto.getCurso());
    System.out.println("Categoría: " + dto.getCategoria().getNombre());
    System.out.println("Costo: " + dto.getCategoria().getCostoCurso());
    System.out.println("Pago x Hora: " + dto.getCategoria().getPagoHora());
    System.out.println("Vacantes: " + dto.getVacantes());
    System.out.println("Ingresos Totales: " + dto.getIngresos());
    System.out.println("Publicidad: " + dto.getPublicidad());
    System.out.println("Logística: " + dto.getLogistica());
    System.out.println("Profesor: " + dto.getProfesor());
    System.out.println("Rentabilidad: " + dto.getRentabilidad());

  }
  
}
