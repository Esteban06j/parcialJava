import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero positivo: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                imprimirPatronAsteriscos(numero);
            } else {
                System.out.println("Por favor, ingrese un número entero positivo.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese un valor numérico válido.");
        } finally {
            scanner.close();
        }
    }
    public static void imprimirPatronAsteriscos(int numero) {
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

