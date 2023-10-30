package pkg25_array1;
public class Main {
    public static void main(String[] args) {
        /*Arreglo
        es una estructura de datos estatica, secuencial y homogenea
        que permite almacenar datos en forma agrupada.
        Hay dos forma de declarar arreglos:
        a) inicializado; pero sin datos
        b) inicializado con datos.*/
        //Forma 1: inicializado; pero sin datos
        //arreglo de 10 posiciones
        int arreglo1[] = new int[10];
        //asignar un valor a una posicion en el arreglo
        //los arreglos se numeran desde 0 hasta N-1 (Zero indexing)
        arreglo1[0] = 7;
        arreglo1[9] = 777;
        //leer un valor del arreglo
        System.out.println( arreglo1[9] );
        System.out.println( arreglo1[3] );
        //recorrer un arreglo e imprimirlo
        System.out.println("********************");
        for( int i = 0; i < arreglo1.length; i++ ){
            System.out.println( arreglo1[i] );
        }
        
        //Forma 2: inicializado con datos
        int arreglo2[] = { 5, 8, 4, 9, 7 };
        System.out.println("********************");
        for( int i = 0; i < arreglo2.length; i++ ){
            System.out.println( arreglo2[i] );
        }
        
        /*Hacer un programa que tenga un arreglo unidimensional
        de numeros enteros de tamaño 25 y llenar cada uno de sus
        elementos con un numero entre 5 y 97 no importa que se repitan.
        Por ultimo imprimir el arreglo.*/
    }   
}