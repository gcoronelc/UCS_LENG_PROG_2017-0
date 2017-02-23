/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package promedio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumnos
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Alumno.
     */

    /**
     * Test of setCurso method, of class Alumno.
     */

    @Test
    public void testCalculaPromedio() {
        System.out.println("CalculaPromedio");
        
        String Nombre="Juan";
        String Curso="POO";
        double Pc1=10;
        double Pc2=15;
        double Pac=20;
        double EF=5;
        
        Alumno alumno = new Alumno(Nombre,Curso,Pc1,Pc2,Pac,EF);
//        alumno.CalculaPromedio();
//        alumno.AlumnoAprobado();
        
        double expResult = 13.75;
        double result = alumno.CalculaPromedio();
        String exString = "Aprobado";
        String resultString = alumno.AlumnoAprobado();
//        
        assertEquals(expResult, result, 0.0);
        assertEquals (exString,resultString);
        
    }
    
    
//    
//    @Test
//    public void testResultadoAlumno() {
//        System.out.println("Resultado Curso Alumno");
//        
//        String Nombre="Juan";
//        String Curso="POO";
//        double Pc1=10;
//        double Pc2=15;
//        double Pac=0;
//        double EF=10;
//        
//        Alumno alumno = new Alumno(Nombre,Curso,Pc1,Pc2,Pac,EF);
//        
//        double expResult = 13.75;
//        double result = alumno.CalculaPromedio();
//        assertEquals(expResult, result, 0.0);
//        
//    }
//    
}
