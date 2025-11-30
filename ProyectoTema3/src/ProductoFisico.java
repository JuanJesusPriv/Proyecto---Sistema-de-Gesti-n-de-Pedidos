public class ProductoFisico extends Producto {
    // Atributo
    private double costeEnvio;

    // Constructor
    public ProductoFisico(String nombre, double precio, double costeEnvio) {
        super(nombre, precio);
        this.costeEnvio = costeEnvio;
    }


    @Override
    public double calcularPrecioFinal() {
        // Precio final = Precio base + Coste de envío 
        return getPrecio() + costeEnvio;
    }

    public double getCosteEnvio() {
        return costeEnvio;
    }


    @Override
    public String toString() {
        return String.format("%s [Físico] (Envío:  | Final:)",
                getNombre(), costeEnvio, calcularPrecioFinal());
    }
}