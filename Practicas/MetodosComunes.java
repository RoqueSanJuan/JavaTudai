import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

class MetodosComunes {
    public static final int MAX=10;
    public static final int MAXVALOR=10;
    public static final int MINVALOR=1;

    public static void main(String[] args){
        char [] arrchar = new char[MAX];
        int [] arrint = new int[MAX];



        int [] prueba = new int[3] ; 
        prueba[0] = 1;



        //cargar_arreglo_aleatorio_char(arrchar);
        //imprimir_arreglo_char(arrchar);        
        cargar_arreglo_aleatorio_int(arrint);
        imprimir_arreglo_int(arrint);
        ordenar_arreglo_seleccion(arrint);
        System.out.println("Abajo arreglo ordenado");
        imprimir_arreglo_int(arrint);

    }

    public static void cargar_arreglo_int(int [] arr){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            for (int pos = 0; pos < MAX; pos++){
                System.out.println("Ingrese un entero: ");
                arr[pos] = Integer.valueOf(entrada.readLine());
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }


    public static void cargar_arreglo_aleatorio_char(char [] arr){
        Random r = new Random();
        for(int i=0; i < MAX; i++){
            arr[i]=(char)(r.nextInt(26)+'a');
        }
    }


    public static void cargar_arreglo_aleatorio_int(int [] arr){
        Random r = new Random();
        for(int i=0; i < MAX; i++){
            arr[i]= r.nextInt(MAXVALOR);
        }
    }

    public static void imprimir_arreglo_char(char [] arr){
        for(int i=0;i<MAX; i++){
            System.out.println("Arreglo en "+ "[" + i + "] -> "+  arr[i]);
        }
    }

    public static void imprimir_arreglo_int(int [] arr){
        for(int i=0;i<MAX; i++){
            System.out.println("Arreglo en "+ "[" + i + "] -> "+  arr[i]);
        }
    }



    public static void ordenar_arreglo_seleccion(int []arr){
        int pos_menor, temp;
        for (int i=0;i < MAX;i++){
            pos_menor=i;
            for(int j=i+1; j < MAX; j++){
                if(arr[j] < arr[pos_menor]){
                    pos_menor = j;
                }
            }
            if (pos_menor != i){
                temp = arr[i];
                arr[i]=arr[pos_menor];
                arr[pos_menor] = temp;
            }
        }
    }

    public static void ordenar_arreglo_inserccion(int []arr){
        int aux, j;
        for (int i=0;i < MAX;i++){
            aux = arr[i];
            j = i -1 ;
            while ((j >=0) && (arr[j]> aux)){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = aux;
        }
    }

    public static void ordenar_arreglo_burbujeo(int [] arr){
        int temp;
        for(int i = 0; i< MAX; i++){
            for(int j=0; j<MAX-1; j++ ){
                if(arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    public static void Prueba(){
        for(int i=0;i < 10 ; i++){
            System.out.println("Hola");
        }

        
    }







}