package pkg25_array1;
import java.util.Random;
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
        Random r = new Random();
        int arreglo3[] = new int[25];
        System.out.println("*********************");
        for( int i = 0; i < arreglo3.length; i++ ){
            //colocar numero al azar entre 5 y 97 al elemento i
            arreglo3[i] = r.nextInt(97-5+1)+5;
            //imprimir el valor generado
            System.out.println( arreglo3[i] );
        }
        /*Hacer un programa que tenga dos arreglos de 25 numeros enteros:
            * llenar el primer arreglo con numeros al azar
              entre 1 y 10 (puede haber numeros repetidos)
            * el segundo arreglo declararlo sin valores iniciales.
            * El programa copiará todos los numeros del primer arreglo
              hacia el segundo arreglo pero elevados al cubo.
          -> al final del programa imprimir el contenido de ambos arreglos.*/
        int arregloA[] = new int[25];
        int arregloB[] = new int[25];
        for( int i = 0; i < arregloA.length; i++ )
        {
            //colocar numero al azar en i-esimo elemento de arregloA
            arregloA[i] = r.nextInt(10-1+1)+1;
            //copiar el valor de arregloA hacia arregloB al cubo
            //arregloB[i] = arregloA[i]*arregloA[i]*arregloA[i];
            arregloB[i] = (int)Math.pow(arregloA[i], 3);
            //imprimir valores de cada arreglo
            System.out.println( arregloA[i]+"\t"+arregloB[i] );
        }
    }   
}