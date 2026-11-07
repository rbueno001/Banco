
import java.time.LocalDate;

public class CuentaDebito extends Cuenta {

    // Constructor
    public CuentaDebito(String numeroCuenta, double saldo, LocalDate fechaEmision, LocalDate fechaVencimiento, double tasaInteres) {
        super(numeroCuenta, saldo, fechaEmision, fechaVencimiento, tasaInteres);

        if (saldo < 0) {
            throw new IllegalArgumentException("La cuenta de débito no puede tener un saldo negativo.");
        }
    }

    // Setters
    @Override
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("La cuenta de débito no puede tener un saldo negativo.");
        }

        super.setSaldo(saldo);
    }

    // Métodos
    @Override
    public String toString() {
        return "Cuenta de débito:\n" + super.toString();
    }

    public void depositar(double montoDeposito) {
    }
}
