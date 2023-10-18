package pkg21_continue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Hacer un programa que imprima los numeros del 1 al 100;
        pero no imprimir aquellos numeros que sean multiplos de 5.
        Obligatorio utilizar instruccion de control de flujo continue.*/
        for( int i = 1; i <= 100; i++ ){
            if( i%5 == 0 ) continue;
            
            System.out.println(i);
        }
        
        /*
        Leer N cantidad de numeros, sumar unicamente
        los numeros positivos.
        El programa termina al digitar un CERO.
        Si digita un numero negativo debe ignorarlo y seguir
        leyendo numeros.
        Desarrollarlo utilizando continue.*/
        Scanner s = new Scanner(System.in);
        float numero;   //variable de control
        float suma = 0; //variable acumulador
        
        do{
            System.out.print("Digitar numero (cero termina el programa): ");
            numero = s.nextFloat();
            
            //si es numero negativo ignorar esta iteracion
            if( numero < 0 ) continue;
            
            suma += numero;
        }while( numero != 0 );
        System.out.println("La suma es: "+suma);
    }
    
}
