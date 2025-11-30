import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;

    // Constructor
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    // Método
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // Método
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecioFinal();
        }
        return total;
    }

    // Método
    public void mostrarResumen() {
        System.out.println("\n==========================================");
        System.out.println(" RESUMEN DEL PEDIDO");
        System.out.println("==========================================");

        // Datos del cliente
        System.out.println(cliente.toString());

        // Productos comprados
        System.out.println("\n--- Productos Adquiridos ---");
        if (productos.isEmpty()) {
            System.out.println("El pedido no contiene productos.");
            return;
        }

        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            System.out.printf("%d. %s - Coste: %.2f\n",
                    i + 1, p.toString(), p.calcularPrecioFinal());
        }

        // Importe total
        System.out.println("\n------------------------------------------");
        System.out.printf(" IMPORTE TOTAL DEL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("==========================================");
    }
}