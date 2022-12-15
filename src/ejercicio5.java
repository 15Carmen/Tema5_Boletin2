import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio5 {
    /*
    Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez con 8 jugadores.
    Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores (habitualmente valores entre 1000
    y 2800, de tipo entero) y luego muestre las puntuaciones en orden descendente (de la más alta a la más baja).
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int[] puntuaciones = new int[8];

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca las puntuaciones de los jugadores
        System.out.println("Introduzca las puntuaciones de los jugadores");

        //Guardamos las puntuaciones en el array
        for (int i = 0; i < puntuaciones.length; i++) {
            puntuaciones[i] = sc.nextInt();
        }

        //Imprimimos el array desordenado (tal y como lo ingresamos)
        System.out.print("Array desordenado: ");
        System.out.println(Arrays.toString(puntuaciones));

        //Imprimimos el array ordenado descendentemente
        System.out.print("Array ordenado: ");

        //Para ello lo ordenamos ascendentemente primero
        Arrays.sort(puntuaciones);

        //Y luego lo imprimimos desde el mayor hasta el más pequeño
        for (int i = puntuaciones.length-1; i >= 0; i--) {
            System.out.print(puntuaciones[i] + " ");
        }

        //Cerramos el scanner
        sc.close();
    }
}
