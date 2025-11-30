
public class main {

    public static void main(String[] args) {
        System.out.println("--- Sistema de Gestión de Pedidos ---");

        // 1. Crear un Cliente 
        Cliente cliente1 = new Cliente(
            "Alicia Pérez",
            "alicia.perez@email.com",
            "C/ Principal, 10, Madrid"
        );

        // 2. Crear Productos de diferentes tipos

        // Producto Físico
        ProductoFisico teclado = new ProductoFisico("Teclado Mecánico", 85.00, 5.50);

        // Producto Físico
        ProductoFisico monitor = new ProductoFisico("Monitor 27'' 4K", 350.00, 12.00);

        // Producto Digital
        ProductoDigital software = new ProductoDigital("Licencia IDE Pro", 120.00, "LIC-12345");

        // Producto Digital 
        ProductoDigital ebook = new ProductoDigital("eBook POO Avanzado", 15.00, "EB-POO-101");


        // 3. Crear un Pedido asociado al Cliente
        Pedido pedido1 = new Pedido(cliente1);

        // 4. Agregar productos al pedido 
        pedido1.agregarProducto(teclado);
        pedido1.agregarProducto(monitor);
        pedido1.agregarProducto(software);
        pedido1.agregarProducto(ebook);

        // 5. Mostrar el resumen completo del pedido
        pedido1.mostrarResumen();
    }
}