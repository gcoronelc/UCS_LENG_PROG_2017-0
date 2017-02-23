
package pe.egcc.proyectoxml;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ze Carlos Guerrera  / David Wong
 */
//Con @XmlRootElement indicamos que la clase Departamento es la clase raiz
@XmlRootElement

public class Departamento {
    private List<Empleado> empleados;

    public Departamento() {
    }
    public List<Empleado> getEmpleados() {
        return empleados;
    }    
    //Con la anotación @XmlElement indicamos que la Clase Empleados es un Elemento Hijo de la Clase
    @XmlElement(name="Empleado")
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

}
