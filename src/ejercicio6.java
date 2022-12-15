import java.util.Scanner;

public class ejercicio6 {
    /*
    Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros aleatorios entre 0 y 99
    (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se mostrará por pantalla si N existe en el
    array, además de cuantas veces. Usa una búsqueda secuencial (no se hace uso de la clase Arrays).
     */

    public static void main(String[] args) {
        //Declaramos las varaibles
        int[] tabla = new int[1000];
        int indiceBusqueda = 0;
        int n;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Rellenamos el array con numeros aleatorios
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 100);
        }

        //Le pedimos al usuario que introduzca un numero cualquiera
        System.out.println("Introduzca un numero entero: ");
        n = sc.nextInt();

        // Mientras no encontremos el valor y no hayamos llegado al final de la tabla
        // incrementamos en 1 el índice de búsqueda
        while (n != tabla[indiceBusqueda] && indiceBusqueda < tabla.length) {
            indiceBusqueda++;
        }

        // En caso de que el índice sea menor que la longitud de la tabla
        // significa que hemos encontrado el elemento
        if (indiceBusqueda < tabla.length) {
            System.out.println("El valor " + n + " se encuentra en la posicion " + indiceBusqueda);
        } else {
            // En caso de que el índice se igual o mayor a la longitud de la tabla
            // significa que el elemento no se encuentra en la tabla
            System.out.println("El elemento " + n + " no se encuentra en la tabla.");
        }

        //Cerramos el scanner
        sc.close();
    }
}
