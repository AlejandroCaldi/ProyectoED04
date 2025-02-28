package inventario;

/**
 * 
 * @author alejandro César Caldi
 * @version 1.6.0
 * @since 2025-02-28
 * @see Tarea par aunidad 4 de la materia Entornos de Desarrollo.
 */
public class Producto {
    
    private String nombre;
    private double precio;
    private int stock;

    /**
     * Constructor de fábrica estático. Invoca al constructor privado para la creación de un producto. 
     * 
     * @param nombre String con el nombre del producto. 
     * @param precio double con el precio del producto. 
     * @param stock int con la cantidad del producto en stock 
     * @return una instancia de Producto. 
     */
    public static Producto crearProducto(String nombre, double precio, int stock) {
       
        return new Producto(nombre, precio, stock);
        
    }
    
    // Constructor privado de fábrica
    /**
     * Constructor privado de la clase Produtco. 
     * 
     * @param nombre String el nombre del producto.
     * @param precio double el precio delproducto. 
     * @param stock int con la cantida de stock del gobierno. 
     * @throws no hay excepciones a manejar. 
     */
    private Producto(String nombre, double precio, int stock){
    
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Muestra información del producto en función de getters y lo imprime en pantalla. 
     */
    public void mostrarInformacion() {
        System.out.println("Producto: " + getNombre() + " | Precio: " + getPrecio() + " | Stock: " + getStock());
    }


    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    
}