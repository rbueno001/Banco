import java.time.LocalDate;
public class CuentaAhorro extends Cuenta {

    // Constructor
    public CuentaAhorro(String numeroCuenta, double saldo, LocalDate fechaEmision, LocalDate fechaVencimiento, double tasaInteres) {
        super(numeroCuenta, saldo, fechaEmision, fechaVencimiento, tasaInteres);

        if (saldo < 100) {
            throw new IllegalArgumentException("La cuenta de ahorro debe tener un saldo mínimo de $100.");
        }
    }

    // Setters
    @Override
    public void setSaldo(double saldo) {
        if (saldo < 100) {
            throw new IllegalArgumentException("La cuenta de ahorro debe mantener un saldo mínimo de $100.");
        }

        super.setSaldo(saldo);
    }

    // Métodos
    @Override
    public String toString() {
        return "Cuenta de ahorro:\n" + super.toString();
    }

    public void depositar(double montoDeposito) {
    }
}
