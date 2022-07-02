package Matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejemplo2 {
	public static final int MAXFILA = 4;
	public static final int MAXCOLUMNA = 5;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;

    
    public static void main(String[] args) {
        int [][] matriz = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_int(matriz);
        imprimir_matriz_int(matriz);
        calcular_promedio(matriz);
    }

    public static void cargar_matriz_aleatorio_int(int [][] mat){
		Random r = new Random();
		for (int fila = 0; fila < MAXFILA; fila++){
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				mat[fila][columna]=(r.nextInt(MAXVALOR+MINVALOR-1) + MINVALOR);
			}
		}
	}


    public static void imprimir_matriz_int(int [][] mat){
		for (int fila = 0; fila < MAXFILA; fila++){
			System.out.print("|");
			for (int columna = 0; columna < MAXCOLUMNA; columna++){
				System.out.print(mat[fila][columna]+"|");
			}
			System.out.println("");
		}
	}


    public static void calcular_promedio(int [][] mat){
        /*
        for filas
            for cada columna
                Sumototalcolumna
            divido por ncolumnas
            imprimo el valor
        */
        int sumaFila=0;
        int promedio=0;
        for (int i =0 ; i < MAXFILA ; i++){
            sumaFila = 0;
            promedio = 0;
            for (int j=0; j < MAXCOLUMNA ; j++){
                sumaFila += mat[i][j];

            }
            promedio = sumaFila / MAXCOLUMNA;
            System.out.println("El promedio de la fila " + i + " es: " + promedio);
        }
    }



}
