import java.util.Random;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero1 = random.nextInt(10) + 1;
        int numero2 = random.nextInt(10) + 1;
        int sumaCorrecta = numero1 + numero2;

        System.out.println("¿Cuál es la suma de " + numero1 + " y " + numero2 + "?");

        Scanner scanner = new Scanner(System.in);

        try {
            int respuestaUsuario = scanner.nextInt();

            if (respuestaUsuario == sumaCorrecta) {
                System.out.println("¡Correcto! La suma es " + sumaCorrecta);
            } else {
                System.out.println("Incorrecto. La suma correcta es " + sumaCorrecta);
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese un valor numérico válido.");
        }
    }
}

