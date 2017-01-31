package pe.egcc.rentacurso.dto;

public class CursoDto {

  // Datos
  private String curso;
  private Categoria categoria;
  private int vacantes;

  // Resultado
  private double ingresos;
  private double publicidad;
  private double logistica;
  private double materiales;
  private double profesor;
  private double rentabilidad;

  public CursoDto() {
  }

  public CursoDto(String curso, Categoria categoria, int vacantes) {
    this.curso = curso;
    this.categoria = categoria;
    this.vacantes = vacantes;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  public int getVacantes() {
    return vacantes;
  }

  public void setVacantes(int vacantes) {
    this.vacantes = vacantes;
  }

  public double getIngresos() {
    return ingresos;
  }

  public void setIngresos(double ingresos) {
    this.ingresos = ingresos;
  }

  public double getPublicidad() {
    return publicidad;
  }

  public void setPublicidad(double publicidad) {
    this.publicidad = publicidad;
  }

  public double getLogistica() {
    return logistica;
  }

  public void setLogistica(double logistica) {
    this.logistica = logistica;
  }

  public double getMateriales() {
    return materiales;
  }

  public void setMateriales(double materiales) {
    this.materiales = materiales;
  }

  public double getProfesor() {
    return profesor;
  }

  public void setProfesor(double profesor) {
    this.profesor = profesor;
  }

  public double getRentabilidad() {
    return rentabilidad;
  }

  public void setRentabilidad(double rentabilidad) {
    this.rentabilidad = rentabilidad;
  }

}
