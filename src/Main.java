import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float sumando1 = 0, sumando2 = 0;
        System.out.println("¡Hola! Vamos a sumar dos números. Empecemos...\n");
        hacerSumaManejandoExcepcion(sumando1, sumando2);
    }

    /**
     * Suma dos números manejado excepción InputMismatchException llamándose recursivamente
     * para empezar de nuevo todo el proceso de interacción
     * @param sumando1
     * @param sumando2
     */
    static void hacerSumaManejandoExcepcion(float sumando1, float sumando2) {
        Scanner escaner = new Scanner(System.in);
        try {
            System.out.print("Teclee el primer sumando:");
            sumando1 = escaner.nextFloat();
            System.out.println();
            System.out.print("Teclee el segundo sumando:");
            sumando2 = escaner.nextFloat();
            System.out.println();
            System.out.println("La suma es " + sumaDosNumeros(sumando1, sumando2) + "\n");
        } catch (InputMismatchException e) {
            System.out.println("Tiene que usar el símbolo coma ',' como delimitador decimal...\n");
            hacerSumaManejandoExcepcion(sumando1, sumando2);
        }
        escaner.close();
    }

    static float sumaDosNumeros(float a, float b) {
        return a + b;
    }
}
