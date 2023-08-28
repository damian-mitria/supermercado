package miapp.interfaz;

import miapp.dominio.*;

public class Main {
    public static void main(String[] args) {

        Supermercado supermercado = new Supermercado();

        supermercado.cargarProductos();

        try {
            supermercado.getListaDeProductos().forEach(producto -> System.out.println(producto.toString()));
            System.out.println("=============================");
            System.out.println("Producto más caro: " + supermercado.productoMasCaro().getNombre());
            System.out.println("Producto más barato: " + supermercado.productoMasBarato().getNombre());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}