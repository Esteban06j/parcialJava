import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número entero positivo: ");
            int numero1 = obtenerNumeroPositivo(scanner);

            System.out.print("Ingrese el segundo número entero positivo: ");
            int numero2 = obtenerNumeroPositivo(scanner);

            int mcd = calcularMCD(numero1, numero2);
            System.out.println("El máximo común divisor (MCD) de " + numero1 + " y " + numero2 + " es: " + mcd);
        } catch (Exception e) {
            System.out.println("Error: Ingrese un número entero válido.");
        } finally {
            scanner.close();
        }
    }

    public static int obtenerNumeroPositivo(Scanner scanner) {
        int numero;

        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Ingrese un número entero válido: ");
                scanner.next();
            }

            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.print("Ingrese un número entero positivo: ");
            }

        } while (numero <= 0);

        return numero;
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}

