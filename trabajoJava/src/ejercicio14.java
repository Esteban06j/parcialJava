import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el tamaño de la lista: ");
            int tamano = obtenerNumeroPositivo(scanner);

            List<Integer> lista = new ArrayList<>();

            for (int i = 0; i < tamano; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                lista.add(obtenerNumero(scanner));
            }

            List<Integer> listaSinDuplicados = eliminarDuplicados(lista);

            System.out.println("Lista original: " + lista);
            System.out.println("Lista sin duplicados: " + listaSinDuplicados);
        } catch (Exception e) {
            System.out.println("Error: Ingrese valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }

    private static int obtenerNumeroPositivo(Scanner scanner) {
        int numero = 0;

        while (!(scanner.hasNextInt() && (numero = scanner.nextInt()) > 0)) {
            System.out.print("Ingrese un número entero positivo: ");
            scanner.next();
        }

        return numero;
    }

    private static int obtenerNumero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese un número válido: ");
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static List<Integer> eliminarDuplicados(List<Integer> lista) {
        return new ArrayList<>(new HashSet<>(lista));
    }
}

