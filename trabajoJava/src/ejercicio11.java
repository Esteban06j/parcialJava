import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el tamaño del vector: ");
            int tamano = obtenerNumeroPositivo(scanner);

            int[] vector = new int[tamano];

            for (int i = 0; i < tamano; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                vector[i] = obtenerNumero(scanner);
            }

            System.out.println("La suma de los elementos del vector es: " + calcularSuma(vector));
        } catch (Exception e) {
            System.out.println("Error: Ingrese valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }

    public static int obtenerNumeroPositivo(Scanner scanner) {
        int numero = 0;

        while (numero <= 0 || !scanner.hasNextInt()) {
            if (!scanner.hasNextInt()) {
                scanner.next(); // Limpiar el buffer del scanner
            }

            System.out.print("Ingrese un número entero positivo: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
            }
        }

        return numero;
    }

    public static int obtenerNumero(Scanner scanner) {
        int numero = 0;

        while (!scanner.hasNextInt()) {
            scanner.next(); // Limpiar el buffer del scanner
            System.out.print("Ingrese un número válido: ");
        }

        if (scanner.hasNextInt()) {
            numero = scanner.nextInt();
        }

        return numero;
    }

    public static int calcularSuma(int[] vector) {
        int suma = 0;

        for (int elemento : vector) {
            suma += elemento;
        }

        return suma;
    }
}

