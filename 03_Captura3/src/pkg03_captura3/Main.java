package pkg03_captura3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b,c;
        //entrada
        System.out.print("a: ");
        a = s.nextDouble();
        System.out.print("b: ");
        b = s.nextDouble();
        System.out.print("c: ");
        c = s.nextDouble();
        //procesamiento
        double r = 8*b+Math.sqrt( ( Math.pow(a, 3)-b*c )/( Math.abs(a-b) ) );
        System.out.println("El resultado es "+r);
        
        //otra forma (por partes)
        double raiz, numerador, denominador;
        numerador = Math.pow(a, 3)-b*c;
        denominador = Math.abs(a-b);
        raiz = Math.sqrt(numerador/denominador);
        r = 8*b+raiz;
        System.out.println("El resultado es "+r);
    }
    
}
