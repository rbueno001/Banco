import java.time.LocalDate;
public class CuentaCredito extends Cuenta {

    // Atributos
    private double limiteCredito;
    private String tipoTarjeta;

    // Constructor
    public CuentaCredito(String numeroCuenta, double saldo, LocalDate fechaEmision, LocalDate fechaVencimiento, double tasaInteres, double limiteCredito, String tipoTarjeta) {
        super(numeroCuenta, saldo, fechaEmision, fechaVencimiento, tasaInteres);

        if (saldo != 0) {
            throw new IllegalArgumentException("La cuenta de crédito debe iniciar con un saldo de $0.");
        }

        if (limiteCredito <= 0) {
            throw new IllegalArgumentException("El límite de crédito debe ser mayor que $0.");
        }

        this.limiteCredito = limiteCredito;
        this.tipoTarjeta = tipoTarjeta;
    }

    // Getters
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    // Setters
    public void setLimiteCredito(double limiteCredito) {
        if (limiteCredito <= 0) {
            throw new IllegalArgumentException("El límite de crédito debe ser mayor que $0.");
        }

        if (limiteCredito < getSaldo()) {
            throw new IllegalArgumentException("El límite de crédito no puede ser menor que la deuda actual.");
        }

        this.limiteCredito = limiteCredito;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    @Override
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("La deuda no puede ser negativa.");
        }

        if (saldo > limiteCredito) {
            throw new IllegalArgumentException("La deuda no puede superar el límite de crédito.");
        }

        super.setSaldo(saldo);
    }

    // Métodos
    @Override
    public String toString() {
        return "Cuenta de crédito:\n" + super.toString() +
                "\nLímite de crédito: " + limiteCredito +
                "\nTipo de tarjeta: " + tipoTarjeta;
    }

    public void realizarAbono(double montoAbono) {
    }
}
