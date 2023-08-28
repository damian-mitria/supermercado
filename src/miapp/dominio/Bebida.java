package miapp.dominio;

public class Bebida extends Producto {
    private double capacidadEnLitros;

    public Bebida(int precio, String nombre, double capacidadEnLitros) {
        super(precio, nombre);
        this.capacidadEnLitros = capacidadEnLitros;
    }

    public double getCapacidadEnLitros() {
        return capacidadEnLitros;
    }

    public void setCapacidadEnLitros(double capacidadEnLitros) {
        this.capacidadEnLitros = capacidadEnLitros;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Litros: " + this.getCapacidadEnLitros() + " /// Precio: $" + this.getPrecio();
    }
}