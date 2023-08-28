package miapp.dominio;

public abstract class Producto implements Comparable<Producto> {

    private int precio;
    private String nombre;

    public Producto(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String toString();

    @Override
    public int compareTo(Producto o) {
        return this.precio > o.getPrecio() ? 1 : this.precio < o.getPrecio() ? -1 : 0;
    }
}