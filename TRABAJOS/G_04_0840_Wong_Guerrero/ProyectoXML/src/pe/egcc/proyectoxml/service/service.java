
package pe.egcc.proyectoxml.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import pe.egcc.proyectoxml.Departamento;
import pe.egcc.proyectoxml.Empleado;
import pe.egcc.proyectoxml.main;
import pe.egcc.proyectoxml.model.dto;

/**
 *
 * @author Ze Carlos Guerrero / David Wong Herrera
 */
public class service {
    
    //
    public static void crearXML(dto Dto){
            try{
                List<Empleado> empleados = new ArrayList<>();
                Empleado emp = new Empleado();
                emp.setIdEmpleado(Dto.getIdEmpleado());
                emp.setNombre(Dto.getNombre());
                emp.setPaterno(Dto.getPaterno());
                emp.setMaterno(Dto.getMaterno());

                empleados.add(emp);

                Departamento depto = new Departamento();
                depto.setEmpleados(empleados);

                //Contexto JAXB
                JAXBContext ctx = JAXBContext.newInstance(Departamento.class);
                //Realiza la conversión de los objetos Java a XML
                Marshaller ms = ctx.createMarshaller();

                //Preparames el formato como se va a generar el archivo de XML
                ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

                //Genera el archivo XML
                ms.marshal(depto, new File("D:\\TRABAJOS\\G_04_0840_Wong_Guerrero\\ProyectoXML\\Archivos XML\\" + Dto.getNombreArchivo() + ".xml"));

            }catch(JAXBException ex){
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public static void LeerXml() { 
            try{
                //Crear el Contexto de JAXB
                JAXBContext ctx = JAXBContext.newInstance(Departamento.class);

                //Crear la Clase que nos permite leer el Archivo XML
                Unmarshaller ums = ctx.createUnmarshaller();

                Departamento depto = (Departamento)ums.unmarshal(
                    new File("D:\\EGCC\\Proyectos\\ProyectoXML\\Archivos XML\\depto11leer.xml"));

                for (Empleado emp : depto.getEmpleados()){
                    System.out.println(emp.getIdEmpleado() + " " 
                                   + emp.getNombre() + " "
                                   + emp.getPaterno() + " "
                                   + emp.getMaterno());            
                }
            }catch(JAXBException ex){
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
}
