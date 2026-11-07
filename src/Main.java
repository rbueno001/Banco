import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {

        Administrador administrador = new Administrador(
                "Raquel Bueno",
                "184000008611",
                "raquelbueno@test.com",
                "Cenfotec2026!"
        );

        System.out.println(administrador);

        Cliente cliente1 = new Cliente(
                "Alexander Bueno",
                "111111111",
                "alexanderbueno@test.com",
                "Gimnasio2026!",
                "Masculino",
                "Empleado de gimnasio",
                "San José"
        );

        System.out.println();
        System.out.println(cliente1);

        Cliente cliente2 = new Cliente(
                "Henry Sandoval",
                "222222222",
                "henrysandoval@test.com",
                "Kolbi2026!",
                "Masculino",
                "Servicio al cliente",
                "Cartago"
        );

        System.out.println();
        System.out.println(cliente2);

        Cliente cliente3 = new Cliente(
                "Nuria Segundo",
                "333333333",
                "nuriasegundo@test.com",
                "Cubana2026!",
                "Femenino",
                "Ama de casa",
                "Heredia"
        );

        System.out.println();
        System.out.println(cliente3);

        CuentaCredito cuentaCreditoAlexander = new CuentaCredito(
                "100001",
                0,
                LocalDate.of(2026, 11, 6),
                LocalDate.of(2030, 11, 6),
                20,
                5000,
                "Visa"
        );

        cliente1.getCuentas().add(cuentaCreditoAlexander);

        System.out.println();
        System.out.println(cuentaCreditoAlexander);

        CuentaAhorro cuentaAhorroAlexander = new CuentaAhorro(
                "100002",
                1500,
                LocalDate.of(2026, 11, 6),
                LocalDate.of(2030, 11, 6),
                3
        );

        cliente1.getCuentas().add(cuentaAhorroAlexander);

        System.out.println();
        System.out.println(cuentaAhorroAlexander);

        CuentaDebito cuentaDebitoHenry = new CuentaDebito(
                "100003",
                2000,
                LocalDate.of(2026, 11, 6),
                LocalDate.of(2030, 11, 6),
                0
        );

        cliente2.getCuentas().add(cuentaDebitoHenry);

        System.out.println();
        System.out.println(cuentaDebitoHenry);

        CuentaCredito cuentaCreditoHenry = new CuentaCredito(
                "100004",
                0,
                LocalDate.of(2026, 11, 6),
                LocalDate.of(2030, 11, 6),
                18,
                3000,
                "Mastercard"
        );

        cliente2.getCuentas().add(cuentaCreditoHenry);

        System.out.println();
        System.out.println(cuentaCreditoHenry);

        CuentaAhorro cuentaAhorroNuria = new CuentaAhorro(
                "100005",
                3000,
                LocalDate.of(2026, 11, 6),
                LocalDate.of(2030, 11, 6),
                3
        );

        cliente3.getCuentas().add(cuentaAhorroNuria);

        System.out.println();
        System.out.println(cuentaAhorroNuria);

        CuentaDebito cuentaDebitoNuria = new CuentaDebito(
                "100006",
                1000,
                LocalDate.of(2026, 11, 6),
                LocalDate.of(2030, 11, 6),
                0
        );

        cliente3.getCuentas().add(cuentaDebitoNuria);

        System.out.println();
        System.out.println(cuentaDebitoNuria);
    }
}
