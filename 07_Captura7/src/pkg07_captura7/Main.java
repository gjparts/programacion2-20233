package pkg07_captura7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        EJEMPLO DE USO DEL OPERADOR LOGICO AND
        Leer una edad de una persona y posteriormente imprimir a que
        grupo poblacional pertenece de acuerdo a la siguiente tabla:
        GRUPO               Rango de Edad
        menor de edad       menores de 18
        mayor de edad       entre 18 y 20
        adulto              entre 21 y 59
        tercera edad        de 60 en delante*/
        Scanner s = new Scanner(System.in);
        int edad;
        System.out.print("Digite una edad: ");
        edad = s.nextInt();
        
        if( edad < 18 ) System.out.println("Menor de edad");
        if( edad >= 18 && edad <= 20 ) System.out.println("Mayor de edad");
        if( edad >= 21 && edad <= 59 )  System.out.println("Adulto");
        if( edad >= 60 ) System.out.println("Tercera Edad");
        
    }
    
}
