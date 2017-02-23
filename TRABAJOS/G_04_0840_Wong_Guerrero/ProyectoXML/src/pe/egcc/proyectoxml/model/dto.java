package pe.egcc.proyectoxml.model;

/**
 *
 * @author Ze Carlos Guerrero / David Wong Herrera
 */
public class dto {
    //Datos de Entrada
    private int idEmpleado;
    private String nombre;
    private String paterno;
    private String materno;
    private String NombreArchivo;

    public dto() {
    }

    public dto(int idEmpleado, String nombre, String paterno, String materno, String NombreArchivo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.NombreArchivo = NombreArchivo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombreArchivo() {
        return NombreArchivo;
    }

    public void setNombreArchivo(String NombreArchivo) {
        this.NombreArchivo = NombreArchivo;
    }

    
    
    
}
