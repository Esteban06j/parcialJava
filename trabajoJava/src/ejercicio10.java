import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero positivo: ");
            int numero = obtenerNumeroPositivo(scanner);

            System.out.print("Ingrese un dígito (0-9): ");
            int digito = obtenerDigito(scanner);

            int conteo = contarDigitos(numero, digito);
            System.out.println("El dígito " + digito + " aparece " + conteo + " veces en el número " + numero + ".");
        } catch (Exception e) {
            System.out.println("Error: Ingrese un valor válido.");
        } finally {
            scanner.close();
        }
    }

    public static int obtenerNumeroPositivo(Scanner scanner) {
        int numero;

        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Ingrese un número válido: ");
                scanner.next();
            }

            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.print("Ingrese un número positivo: ");
            }

        } while (numero <= 0);

        return numero;
    }

    public static int obtenerDigito(Scanner scanner) {
        int digito;

        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Ingrese un dígito válido (0-9): ");
                scanner.next();
            }

            digito = scanner.nextInt();

            if (digito < 0 || digito > 9) {
                System.out.print("Ingrese un dígito válido (0-9): ");
            }

        } while (digito < 0 || digito > 9);

        return digito;
    }

    public static int contarDigitos(int numero, int digito) {
        int conteo = 0;

        while (numero > 0) {
            int ultimoDigito = numero % 10;
            if (ultimoDigito == digito) {
                conteo++;
            }
            numero /= 10;
        }

        return conteo;
    }
}
