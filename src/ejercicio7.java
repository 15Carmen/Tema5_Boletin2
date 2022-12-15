import java.util.Arrays;

public class ejercicio7 {
    /*
    Realiza un programa que cree dos tablas, la primera con los 6 números de una apuesta de la primitiva generados
    aleatoriamente entre 1 y 49 y, la segunda (ordenada) con los 6 números de la combinación ganadora. La función
    devolverá el número de aciertos.
     */

    public static void main(String[] args) {

        //Declaramos las constantes
        final int longitudArray=6; //Constante que usaremos para indicar la longitud de los arrays

        //Declaramos las variables
        int[] miBoleto = new int[longitudArray];        //Array donde guardaremos 6 numeros aleatorios desordenados
        int[] boletoGanador = new int[longitudArray];   //Array donde guardaremos 6 numeros aleatorios ordenados
        int contador=0;                                 //Variable contador donde vamos a guardar la cantidad de numeros acertados
        int numAuxiliar;                                //Variable donde vamos a guardar temporalmente los numeros del primer array para poder comprarlos con los del segundo

        //Rellenamos el array con numeros aleatorios
        for (int i = 0; i < longitudArray; i++) {
            miBoleto[i] = (int) (Math.random() * 49);
            boletoGanador[i] = (int) (Math.random() * 49);
        }

        //Ordenamos el segundo array
        Arrays.sort(boletoGanador);

        //Imprimimos los dos boletos
        System.out.println("Tu boleto es: " + Arrays.toString(miBoleto));
        System.out.println("El boleto ganador es: " + Arrays.toString(boletoGanador));

        //Comparamos los dos arrays numero por numero para ver cuantos numeros del segundo array tiene el primero
        for (int i = 0; i < longitudArray; i++) {
            numAuxiliar=miBoleto[i];                                           //Añadimos en la variable num un numero del primer array
            int posicion = Arrays.binarySearch(boletoGanador, numAuxiliar);    //Buscamos si hay un numero igual en el segundo array y guardamos la posición que nos devuelva en una variable

            if (posicion>=0){   //Si la variable posición no es negativa, eso significa que el numero se encuentra en el primer boleto
                contador++;     //Añadimos 1 al contador de numerosAcertados
            }
        }

        //Imprimimos los numeros que hemos acertado
        System.out.println("Has acertado " + contador + " numeros del boleto");

    }


}
