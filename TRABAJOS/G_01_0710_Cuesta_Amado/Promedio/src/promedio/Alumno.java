/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package promedio;

/**
 *
 * @author alumnos
 */
public class Alumno {
   
    private String Nombre;
    private String Curso;
    double notaPc1;
    double notaPc2;
    double notaParticipacionActiva;
    double EvaluacionFinal;
     


    public Alumno(String Nombre,String Curso, double notaPc1, double notaPc2, double notaParticipacionActiva, double EvaluacionFinal) {
        this.Nombre = Nombre;
        this.Curso = Curso;
        this.notaPc1 = notaPc1;
        this.notaPc2 = notaPc2;
        this.notaParticipacionActiva = notaParticipacionActiva;
        this.EvaluacionFinal = EvaluacionFinal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public double getNotaPc1() {
        return notaPc1;
    }

    public void setNotaPc1(double notaPc1) {
        this.notaPc1 = notaPc1;
    }

    public double getNotaPc2() {
        return notaPc2;
    }

    public void setNotaPc2(double notaPc2) {
        this.notaPc2 = notaPc2;
    }

    public double getNotaParticipacionActiva() {
        return notaParticipacionActiva;
    }

    public void setNotaParticipacionActiva(double notaParticipacionActiva) {
        this.notaParticipacionActiva = notaParticipacionActiva;
    }

    public double getEvaluacionFinal() {
        return EvaluacionFinal;
    }

    public void setEvaluacionFinal(double EvaluacionFinal) {
        this.EvaluacionFinal = EvaluacionFinal;
    }

    
    public double CalculaPromedio(){
    double Promedio=0;
    
    Promedio=((getNotaPc1()*0.20)+(getNotaPc2()*0.25)+(getNotaParticipacionActiva()*0.25)+(getEvaluacionFinal()*0.30));
    
    return Promedio;
    }
    
    public String AlumnoAprobado(){
        
        String Resultado="Aprobado";
        if  (CalculaPromedio() >= 12.75) {
                Resultado = "Aprobado";
            } else {
                    Resultado = "Desaprobado";
        
        }
        return Resultado;
        
        
       
    }
    
}
