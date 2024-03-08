import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un año: ");
            int anio = scanner.nextInt();
            boolean esBisiesto = false;
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                esBisiesto = true;
            }
            if (esBisiesto) {
                System.out.println(anio + " es un año bisiesto.");
            } else {
                System.out.println(anio + " no es un año bisiesto.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese un año válido.");
        } finally {
            scanner.close();
        }
    }
}
