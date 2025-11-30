public abstract class Producto {
    // Atributos
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract double calcularPrecioFinal();

    @Override
    public String toString() {
        return String.format("(Precio Base: )", nombre, precio);
    }
}