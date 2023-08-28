package miapp.dominio;

public class Fruta extends Producto {
    private TiposDeUnidades unidadDeVenta;

    public Fruta(int precio, String nombre, TiposDeUnidades unidadDeVenta) {
        super(precio, nombre);
        this.unidadDeVenta = unidadDeVenta;
    }

    public TiposDeUnidades getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(TiposDeUnidades unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Precio: $" + this.getPrecio() + " /// Unidad de venta: " + this.getUnidadDeVenta().toString().toLowerCase();
    }

    public enum TiposDeUnidades {
        GRAMOS, KILO
    }
}