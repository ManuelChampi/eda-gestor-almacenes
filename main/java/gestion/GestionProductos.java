package gestion;

import models.Producto;

public class GestionProductos {
    // Metodo para agregar un producto nuevo a un almacen
    public void agregarProductoAlmacen(int codigoAlmacen, int codigoProducto, String descripcion, int stock) {
        // Implementación para agregar un producto a un almacen especifico
    }

    // Metodo para agregar productos a un almacen desde un archivo
    public void agregarProductosAlmacenDesdeArchivo(int codigoAlmacen, String filePath) {
        // Implementación para cargar productos desde un archivo y agregarlos a un almacen especifico
    }

    // Metodo para dar de baja un producto de un almacen
    public void darDeBajaProductoAlmacen(int codigoAlmacen, int codigoProducto) {
        // Implementación para eliminar un producto de un almacen especifico
    }

    // Metodo para buscar un producto en un almacen
    public Producto buscarProductoEnAlmacen(int codigoAlmacen, int codigoProducto) {
        // implementación para buscar un producto en un almacen especifico
        // devuelve el producto encontrado o null si no existe
    }

    // Metodo para mostrar los productos de un almacen
    public void mostrarProductosAlmacen(int codigoAlmacen) {
        // Implementación para mostrar los productos de un almacen especifico
    }
}
