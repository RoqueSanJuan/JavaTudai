package Matrices;

import java.util.Random;


public class practicaMatriz {
    
    private static final int MAXFILA = 5;
    private static final int MAXCOLUMNA = 5;
    private static final int MAXVALOR = 5;

    public static void main(String[] args) {
        
        int [][] matriz = new int[MAXFILA][MAXCOLUMNA] ; 
        cargarInt(matriz);
        int [] vecsum = new int[MAXCOLUMNA];

        int acum = 0;

        for(int i=0;i < MAXCOLUMNA;i++){
            vecsum[i]=0;
        }

        for(int i=0; i < MAXFILA ; i++){
            for(int j=0; j < MAXCOLUMNA ; j++){
                vecsum[j] = vecsum[j] + matriz[i][j]; 

                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println( "=" + acum);
            acum = 0 ;
        }
        System.out.println("Imprimo Vector");
        for(int i=0 ; i < MAXCOLUMNA; i++){
            System.out.println( vecsum[i] + "| " );
        }

    }



    public static void eliminarvocal(char [] arreglo, int inicio, int fin){
        boolean borre = false;
        while( borre != true && inicio < fin){
            if( arreglo[inicio] == 'a' ||
                arreglo[inicio] == 'e' || 
               arreglo[inicio] == 'i' || 
               arreglo[inicio] == 'o' || 
               arreglo[inicio] == 'u'
            ){
                //arreglo[inicio] = ' ';
                correrDerecha(arreglo);
                borre = true;
            }else{
                inicio++;
            }
        }
    }

    public static void correrDerecha(char [] arreglo){

    }
    

    public static void llevarMAT1MAT2(char [][] MAT1 ,char [][] MAT2 , int fila, int inicioMAT1, int finMAT1, int inicioMAT2, int finMAT2 ){
            
        



    }

    public static void cargarInt(int [][] matriz){
        Random r = new Random();
        for(int fila=0; fila < MAXFILA ; fila ++){
            for(int colum = 0; colum < MAXCOLUMNA ; colum ++){
                matriz[fila][colum] = r.nextInt(MAXVALOR);
            }
        }
    }
    
    
}
