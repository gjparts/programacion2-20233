package pkg16_for3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de esos
        10 numeros, su promedio, asi como cual es el mayor
        y el menor de los 10 numeros.*/
        Scanner s = new Scanner(System.in);
        int numero; //variable para leer numeros
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int suma = 0;   //variable acumulador
        
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digitar numero: ");
            numero = s.nextInt();
            suma += numero;
            
            if( numero > mayor )
                mayor = numero;
            if( numero < menor )
                menor = numero;
        }
        System.out.println("La suma es: "+suma);
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);
        System.out.println("El promedio es: "+(suma/10) );
    }
    
}
