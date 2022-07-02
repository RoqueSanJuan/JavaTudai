package Practicas;

import java.util.Random;

/*
 * Dada una matriz MAT de enteros precargada, se pide cargar un arreglo ARR_SUMAS_FILAS_ORD los indices de las filas de MAT y 
 * ordenarlo de forma tal que permita mantener un orden creciente de MAT por la suma de sus filas.
 */

public class MatEj10 {
    
    private static final int MAXFILA = 10;
    private static final int MAXCOLUMNA = 10;
    private static final int MAXVALOR = 10;

    public static void main(String[] args) {
        int [][] matriz = new int[MAXFILA][MAXCOLUMNA];
        

    }


    public static void cargar_matriz_aleatorio_int(int [][] matriz){
        Random r = new Random();
        for(int i=0; i < MAXFILA; i++){
            for(int j=0; j<MAXCOLUMNA; j++){
                matriz[i][j]= r.nextInt(MAXVALOR);
            }
        }
    }

    public static void mostrar_matriz_aleatorio_int(int [][] matriz){
        for(int i=0; i < MAXFILA; i++){
            for(int j=0; j< MAXCOLUMNA; j++){
                System.out.println(matriz[i][j]+ "|");
            }
            System.out.println("");
        }
    }


}
