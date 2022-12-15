import java.util.Arrays;

import static java.util.Arrays.fill;

public class ejercicio2 {
    /*
    Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores:
    1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla.
    En esta ocasión has de utilizar Arrays.fill().
     */

    public static void main(String[] args) {
        int[] tabla = new int[55];
        int desde=0;
        int hasta;

        for (int i = 1; i < 11; i++) {
            hasta=i+desde;
            fill(tabla, desde, hasta, i);
            desde=hasta;
        }

        System.out.println(Arrays.toString(tabla));
    }
}
