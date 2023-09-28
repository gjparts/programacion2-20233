package pkg07_captura7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que imprima el mayor de 4 numeros
        los cuales seran digitados por el usuario*/
        Scanner s = new Scanner(System.in);
        int a,b,c,d, mayor = 0;
        System.out.print("Digitar a: ");
        a = s.nextInt();
        System.out.print("Digitar b: ");
        b = s.nextInt();
        System.out.print("Digitar c: ");
        c = s.nextInt();
        System.out.print("Digitar d: ");
        d = s.nextInt();
        //resolvemos usando AND
        if( a >= b && a >= c && a >= d ) mayor = a;
        if( b >= a && b >= c && b >= d ) mayor = b;
        if( c >= a && c >= b && c >= d ) mayor = c;
        if( d >= a && d >= b && d >= c ) mayor = d;
        
        if( a == b && a == c && a == d )
            System.out.println("los 4 son iguales");
        else
            System.out.println("El mayor es "+mayor);
    }
    
}
