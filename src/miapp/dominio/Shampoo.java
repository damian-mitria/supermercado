package miapp.dominio;

public class Shampoo extends Producto {
    private int contenido;

    public Shampoo(int precio, String nombre, int contenido) {
        super(precio, nombre);
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Contenido: " + (int) this.getContenido() + "ml /// Precio: $" + this.getPrecio();
    }
}