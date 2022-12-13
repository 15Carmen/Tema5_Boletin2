import java.util.Scanner;

import static java.util.Arrays.fill;

public class ejercicio1 {
    /*
    Crea un programa que pida al usuario dos valores N y M y luego cree un array de tamaño N que contenga M en
    todas sus posiciones. Luego muestra el array por pantalla.
     */

    public static void main(String[] args) {

        int[] tabla;
        int n;
        int m;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el tamaño del array");
        n=sc.nextInt();
        tabla[]= new int[n];
        System.out.println("introduzca un valor");
        m= sc.nextInt();

        fill(tabla, 0, n, m);
    }
}
