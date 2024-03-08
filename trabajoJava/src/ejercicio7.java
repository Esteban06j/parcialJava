import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número entero: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            int numero2 = scanner.nextInt();

            System.out.print("Ingrese el tercer número entero: ");
            int numero3 = scanner.nextInt();

            int mayor, intermedio, menor;

            if (numero1 >= numero2 && numero1 >= numero3) {
                mayor = numero1;
                intermedio = (numero2 >= numero3) ? numero2 : numero3;
                menor = (numero2 <= numero3) ? numero2 : numero3;
            } else if (numero2 >= numero1 && numero2 >= numero3) {
                mayor = numero2;
                intermedio = (numero1 >= numero3) ? numero1 : numero3;
                menor = (numero1 <= numero3) ? numero1 : numero3;
            } else {
                mayor = numero3;
                intermedio = (numero1 >= numero2) ? numero1 : numero2;
                menor = (numero1 <= numero2) ? numero1 : numero2;
            }

            System.out.println("Números en orden ascendente: " + menor + ", " + intermedio + ", " + mayor);

        } catch (Exception e) {
            System.out.println("Error: Ingrese valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }
}

