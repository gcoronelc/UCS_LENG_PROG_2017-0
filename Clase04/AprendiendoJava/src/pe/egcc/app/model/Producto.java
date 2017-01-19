package pe.egcc.app.model;

public class Producto {

  private String nombre;
  private int stock;
  private double precio;
  private boolean activo;

  /**
   * Constructor por defecto
   */
  public Producto() {
    // Valores iniciales del objeto
    /*this.nombre = "Cerveza";
    this.stock = 1000;
    this.precio = 10.0;
    this.activo = true;*/
    this("Cerveza Pilsen", 1500, 3.0, true);
    System.out.println("Objeto creado");
  }

  /**
   * Constructor adicional.
   *
   * @param nombre Nombre del producto.
   *
   */
  public Producto(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Constructor adicional
   *
   * @param nombre Nombre del producto.
   * @param stock Stock del producto.
   */
  public Producto(String nombre, int stock) {
    this.nombre = nombre;
    this.stock = stock;
  }

  /**
   * Constructor adicional
   *
   * @param nombre Nombre del producto.
   * @param stock Stock del producto.
   * @param precio Precio del producto.
   */
  public Producto(String nombre, int stock, double precio) {
    this.nombre = nombre;
    this.stock = stock;
    this.precio = precio;
  }

  /**
   * Constructor adicional
   *
   * @param nombre Nombre del producto.
   * @param stock Stock del producto.
   * @param precio Precio del producto.
   * @param activo Estado del producto.
   */
  public Producto(String nombre, int stock, double precio, boolean activo) {
    this.nombre = nombre;
    this.stock = stock;
    this.precio = precio;
    this.activo = activo;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto.");
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

} // Fin de clase
