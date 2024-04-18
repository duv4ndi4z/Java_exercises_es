import java.util.Scanner;

public class AplicacionBancaria {
    public static void main(String[] args) {
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double balance = 1599.99;
        String menu = """
                                
                **** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        int num = 0;
        Scanner teclado = new Scanner(System.in);
        int intUser;

        System.out.println("Bienvenido a IronBank");
        System.out.println("**");
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: " + balance);
        System.out.println("**");

        while (num != 9) {
            System.out.println(menu);
            num = teclado.nextInt();

            switch (num) {
                case 1:
                    System.out.println("El saldo actualizado es: $" + balance);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a retirar: ");
                    double userDeposito = teclado.nextDouble();
                    if (userDeposito < balance) {
                        balance = balance - userDeposito;
                        System.out.println("Se han retirado $" + userDeposito + ". Saldo restante $" + balance);
                    } else {
                        System.out.println("*** Fondos insuficientes, su saldo actual es $"+balance+ "***");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el valor a depositar: ");
                    intUser = teclado.nextInt();
                    balance = balance + intUser;
                    System.out.println("Se han depositado $" + intUser + ". Saldo actual $" + balance);
                    break;

                default:
                    if (num != 9) {
                        System.out.println("Entrada incorrecta! Intente de nuevo.");
                    }
            }
        }
        System.out.println("Se ha finalizado el programa. Gracias por usar nuestros servicios");
    }
}