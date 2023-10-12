package pkg15_for2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*9) VERSION 2
        Hacer un programa que pida al usuario 10 numeros enteros,
        al finalizar el programa imprimira la suma de esos
        10 numeros, asi como cual es el mayor de los 10 numeros.*/
        Scanner s = new Scanner(System.in);
        int numero; //variable para leer numeros
        int mayor = Integer.MIN_VALUE; //variable bandera para determinar el numero mas grande
        int suma = 0;   //variable acumulador
        
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digitar numero: ");
            numero = s.nextInt();
            suma += numero;
            
            if( numero > mayor )
                mayor = numero;
        }
        System.out.println("La suma es: "+suma);
        System.out.println("La mayor es: "+mayor);
    }
    
}
