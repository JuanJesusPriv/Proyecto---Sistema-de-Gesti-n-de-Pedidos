public class ProductoDigital extends Producto {
    // Atributo
    private String licencia;
    private static final double IVA = 0.21; 

    // Constructor
    public ProductoDigital(String nombre, double precio, String licencia) {
        super(nombre, precio);
        this.licencia = licencia;
    }

    
    @Override
    public double calcularPrecioFinal() {
    // Precio final 
        return getPrecio() * (1 + IVA);
    }

    
    public String getLicencia() {
        return licencia;
    }


    @Override
    public String toString() {
        return String.format("%s [Digital] (Licencia:  | Final:)",
                getNombre(), licencia, calcularPrecioFinal());
    }
}