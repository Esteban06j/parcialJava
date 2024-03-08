import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero positivo: ");
            int numero = scanner.nextInt();

            if (numero >= 0) {
                int sumaDigitos = sumarDigitos(numero);
                System.out.println("La suma de los dígitos es: " + sumaDigitos);
            } else {
                System.out.println("Por favor, ingrese un número entero positivo.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese un valor numérico válido.");
        } finally {
            scanner.close();
        }
    }

    private static int sumarDigitos(int numero) {
        int suma = 0;

        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }

        return suma;
    }
}
