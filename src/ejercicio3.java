import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {

    /*
    Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array y los 10 últimos
    en otro array. Por último, comparará ambos arrays y le dirá al usuario si son iguales o no.
     */
    public static void main(String[] args) {

        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 numeros");
        for (int i = 0; i < 10; i++) {
            tabla1[i]= sc.nextInt();
        }

        System.out.println("Introduzca otros 10 numeros");
        for (int i = 0; i < 10; i++) {
            tabla2[i]= sc.nextInt();
        }

        System.out.println("Estos son los dos arrays");
        System.out.println(Arrays.toString(tabla1));
        System.out.println(Arrays.toString(tabla2));

        System.out.println("Comprobamos si los arrays son iguales:");
        System.out.println(Arrays.equals(tabla1, tabla2));

        sc.close();

    }
}
