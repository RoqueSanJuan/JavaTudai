package EjerciciosVarios;

/*Escribir un diseno de un programa que mientras el usuario ingrese de un numero entero mayor que 0, imprima la tabla de multiplicar de 10. Cuando salga del ciclo vuelva a imprimir
la tabla de multiplicar de 10.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Clase_6_Ejemplo_6 {
    public static final int MIN = 0;
    public static final int MAXMULTIPLICADOR = 10;
    public static final int VALOR = 10;
    public static void main(String[] args) {
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero entero natural");
            numero = Integer.valueOf(entrada.readLine());
                while (numero > MIN){
                imprimir_tabla_de_multiplicar_de_10();
                System.out.println("Ingrese un numero entero natural");
                numero = Integer.valueOf(entrada.readLine());
                }
            imprimir_tabla_de_multiplicar_de_10 ();
        }
        catch (Exception exc){
            System.out.println(exc);
        }
    }
    public static void imprimir_tabla_de_multiplicar_de_10 (){
        for (int multiplicador = 1; multiplicador <= MAXMULTIPLICADOR; multiplicador++){
            System.out.println(multiplicador +" * "+VALOR+" = "+(multiplicador*VALOR));
        }
    }
}