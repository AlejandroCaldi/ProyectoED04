package inventario;

import java.util.ArrayList;

/**
 * 
 * @author Alejandro César Caldi
 * @version 1.1.0 - modificada para adecuar cambios en Producto. 
 * @since 2025-02-28
 * @see Tarea par aunidad 4 de la materia Entornos de Desarrollo.
 */
public class Inventario {
    public ArrayList<Producto> listaProductos;

    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    /**
     * Agrega productos al Array<List> de la lista de productos. 
     * @param p Instancia de producto a ser agregar a la lista.. 
     */
    public void agregar(Producto p) {
        listaProductos.add(p);
    }

    /**
     * Recorre la lista de productos i va imprimiendo en pantalla cada item dentro de dichha lista 
     */
    public void mostrar() {
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).mostrarInformacion();
        }
    }

public static void main(String[] args) {
    
        System.out.println("Hola");
        Inventario inventario = new Inventario();

        Producto p1 = Producto.crearProducto("Laptop", 1200.99, 10);
        Producto p2 = Producto.crearProducto("Mouse", 25.50, 50);

        inventario.agregar(p1);
        inventario.agregar(p2);

        System.out.println("Inventario de productos:");
        inventario.mostrar();
    }
}