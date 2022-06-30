package EjerciciosVarios;

/*Hacer un programa que mientras que el usuario cargue un numero entero distinto de 0 lo imprima si es par
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase_5_Ejemplo_3 {
    public static void main(String[] args) {
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero entero (0 para salir):");
            numero = Integer.valueOf(entrada.readLine());
            while (numero != 0){
                if ((numero % 2) == 0) {
                    System.out.println("El valor es :" + numero);
                }
                System.out.println("Ingrese un numero entero (0 para salir):");
                numero = Integer.valueOf(entrada.readLine());
            }
        }
        catch (Exception exc){
            System.out.println(exc);
        }
    }
}