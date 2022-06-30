package EjerciciosVarios;

/*Dado un numero entero con valor inicial 1, hacer una iteración que haga
incrementar numero de a uno hasta un valor MAX = 4 (constante). Mientras
itera deberá imprimir numero
*/
public class Clase_5_Ejemplo_1 {
    public static void main (String [] args) {
        final int MAX = 4;
        int numero = 1;
        while (numero <= MAX){
            System.out.println("El numero es: " + numero);
            //al cambiar de valor el numero significa que el valor de la
            //expresion logica va a cambiar
            numero++;
        }
    }
}