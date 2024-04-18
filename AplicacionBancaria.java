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
        int userInput = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a IronBank");
        System.out.println("***************************************");
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: $" + balance);
        System.out.println("***************************************");

        while (userInput != 9) {
            System.out.println(menu);
            userInput = teclado.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("El saldo actualizado es: $" + balance);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a retirar: ");
                    double userRetiro = teclado.nextDouble();
                    if (userRetiro < balance) {
                        balance = balance - userRetiro;
                        System.out.println("Se han retirado $" + userRetiro + ". Saldo restante $" + balance);
                    } else {
                        System.out.println("*** Fondos insuficientes, su saldo actual es $"+balance+ "***");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el valor a depositar: ");
                    double userDeposito = teclado.nextDouble();
                    balance = balance + userDeposito;
                    System.out.println("Se han depositado $" + userDeposito + ". Saldo actual $" + balance);
                    break;

                default:
                    if (userInput != 9) {
                        System.out.println("Entrada incorrecta! Intente de nuevo.");
                    }
            }
        }
        System.out.println("Se ha finalizado el programa. Gracias por usar nuestros servicios");
    }
}