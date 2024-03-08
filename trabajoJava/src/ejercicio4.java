import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese la cantidad inicial invertida: ");
            double cantidadInicial = scanner.nextDouble();

            System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
            double tasaInteresAnual = scanner.nextDouble() / 100;

            System.out.print("Ingrese el número de años: ");
            int numeroAnios = scanner.nextInt();

            double montoFinal = calcularInteresCompuesto(cantidadInicial, tasaInteresAnual, numeroAnios);

            System.out.println("El monto final después de " + numeroAnios + " años es: " + montoFinal);
        } catch (Exception e) {
            System.out.println("Error: Ingrese valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }
    private static double calcularInteresCompuesto(double principal, double tasaInteres, int anios) {
        return principal * Math.pow(1 + tasaInteres, anios);
    }
}