public class Administrador extends Usuario {
    // Constructor
    public Administrador(String nombreCompleto, String cedula, String correoElectronico, String contrasenia) {
        super(nombreCompleto, cedula, correoElectronico, contrasenia);
    }
    // Métodos
    @Override
    public String toString() {
        return "Administrador:\n" + super.toString();
    }

    public void consultarClientes() {
    }

    public void consultarCuentas() {
    }
}