
package pe.ucsur.model;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;


@ManagedBean
@RequestScoped 
public class Cliente implements Serializable{
  private String nombre;
  private String primerApellido;
  private String segundoApellido;
  private String email;

  public Cliente() {
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPrimerApellido() {
    return primerApellido;
  }

  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  public String getSegundoApellido() {
    return segundoApellido;
  }

  public void setSegundoApellido(String segundoApellido) {
    this.segundoApellido = segundoApellido;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  
}
