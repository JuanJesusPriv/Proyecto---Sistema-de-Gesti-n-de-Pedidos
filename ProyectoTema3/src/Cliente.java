public class Cliente {
    // Atributos
    private String nombre;
    private String correo;
    private String direccion;

    // Constructor
    public Cliente(String nombre, String correo, String direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    // toString()
    @Override
    public String toString() {
        return String.format("Cliente: %s | Correo: %s | Dirección: %s",
                nombre, correo, direccion);
    }
}