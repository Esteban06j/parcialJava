import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese la cantidad de dinero en la moneda original: ");
            double cantidadO = scanner.nextDouble();


            System.out.print("Ingrese la tasa de cambio: ");
            double tasaCambio = scanner.nextDouble();

            double cantidadConvertida = convertirMoneda(cantidadO, tasaCambio);
            System.out.println("La cantidad convertida es: " + cantidadConvertida);
        } catch (Exception e) {
            System.out.println("Error: Ingrese valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }
    private static double convertirMoneda(double cantidadO, double tasaCambio) {
        return cantidadO * tasaCambio;
    }
}
