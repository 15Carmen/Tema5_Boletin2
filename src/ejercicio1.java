import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.fill;

public class ejercicio1 {
    /*
    Crea un programa que pida al usuario dos valores N y M y luego cree un array de tamaño N que contenga M en
    todas sus posiciones. Luego muestra el array por pantalla.
     */

    public static void main(String[] args) {

        //Declaramos las variables
        int[] tabla;
        int n;
        int m;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca el tamaño que desea que tenga el array y lo guardamos en la variable n
        System.out.println("Introduzca el tamaño del array");
        n=sc.nextInt();
        //Indicamos que el array tenga un tamaño n
        tabla = new int[n];

        //Le pedimos al usuario que introduzca un valor cualquiera y lo guardamos en la variable m
        System.out.println("introduzca un valor");
        m= sc.nextInt();

        //Rellenamos el array completamente con la variable m
        fill(tabla, 0, n, m);

        //Imprimimos por consola el array
        System.out.println(Arrays.toString(tabla));
    }
}
