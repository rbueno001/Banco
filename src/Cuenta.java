import java.time.LocalDate;
public class Cuenta {

    // Atributos
    private String numeroCuenta;
    private double saldo;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private double tasaInteres;

    // Constructor
    public Cuenta(String numeroCuenta, double saldo, LocalDate fechaEmision, LocalDate fechaVencimiento, double tasaInteres) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.tasaInteres = tasaInteres;
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    // Setters
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    // Métodos
    @Override
    public String toString() {
        return "Número de cuenta: " + numeroCuenta +
                "\nSaldo: " + saldo +
                "\nFecha de emisión: " + fechaEmision +
                "\nFecha de vencimiento: " + fechaVencimiento +
                "\nTasa de interés anual: " + tasaInteres + "%";
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (objeto == null || getClass() != objeto.getClass()) {
            return false;
        }

        Cuenta cuenta = (Cuenta) objeto;
        return numeroCuenta != null && numeroCuenta.equals(cuenta.numeroCuenta);
    }

    public void realizarPago(double monto) {
    }

    public void generarIntereses() {
    }

    public boolean estaVencida() {
        return !LocalDate.now().isBefore(fechaVencimiento);
    }
}
