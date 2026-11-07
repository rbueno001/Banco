import java.util.ArrayList;
public class Cliente extends Usuario {

    // Atributos
    private String sexo;
    private String profesion;
    private String direccion;
    private ArrayList<Cuenta> cuentas;

    // Constructor
    public Cliente(String nombreCompleto, String cedula, String correoElectronico, String contrasenia, String sexo, String profesion, String direccion) {
        super(nombreCompleto, cedula, correoElectronico, contrasenia);
        this.sexo = sexo;
        this.profesion = profesion;
        this.direccion = direccion;
        this.cuentas = new ArrayList<>();
    }

    // Getters
    public String getSexo() {
        return sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    // Setters
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Métodos
    @Override
    public String toString() {
        return "Cliente:\n" + super.toString() +
                "\nSexo: " + sexo +
                "\nProfesión: " + profesion +
                "\nDirección: " + direccion;
    }

    public void consultarCuentas() {
    }

    public void agregarCuenta(Cuenta cuenta) {
    }

    public void consultarSaldoConsolidado() {
    }
}