package miapp.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Supermercado {

    private List<Producto> listaDeProductos;

    public Supermercado() {
        this.listaDeProductos = new ArrayList<>();
    }

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void agregarProducto(Producto producto) {
        this.listaDeProductos.add(producto);
    }

    public void cargarProductos() {
        this.listaDeProductos = Arrays.asList(
                new Bebida(20, "Coca-Cola Zero", 1.5),
                new Bebida(18, "Coca-Cola", 1.5),
                new Shampoo(19, "Shampoo Sedal", 500),
                new Fruta(64, "Frutillas", Fruta.TiposDeUnidades.KILO)
        );
    }

    public Producto productoMasCaro() {
        return listaDeProductos.stream().max(Comparator.comparing(producto -> producto.getPrecio())).get();
    }

    public Producto productoMasBarato() {
        return listaDeProductos.stream().min(Comparator.comparing(producto -> producto.getPrecio())).get();
    }
}