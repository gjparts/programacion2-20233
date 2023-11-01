package pkg29_string4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //comparar cadenas de texto
        //incorrecto: no usar == o != para comparar String
        //porque lo que hace es comparar los punteros de memoria
        //de ambos objetos String
        String a1 = "Manzana";
        String a2 = "Manzana";
        if( a1 == a2 )
            System.out.println("a1 y a2 son iguales.");
        else
            System.out.println("a1 y a2 no son iguales");
        //correcto: usar el metodo equals para comparar ambos objetos
        Scanner s = new Scanner(System.in);
        String s1, s2;
        System.out.print("Digitar s1: ");
        s1 = s.nextLine();
        System.out.print("Digitar s2: ");
        s2 = s.nextLine();
        //si usa == tendra resultados inesperados
        if( s1 == s2 )
            System.out.println("s1 y s2 son iguales usando ==.");
        else
            System.out.println("s1 y s2 no son iguales usando ==");
        //si usa equals la comparacion sera correcta
        if( s1.equals(s2) == true )
            System.out.println("s1 y s2 son iguales usando equals.");
        else
            System.out.println("s1 y s2 no son iguales usando equals.");
        
        //comparar las dos cadenas de texto ignorando mayusc. y minusc.
        if( s1.equalsIgnoreCase(s2) == true )
            System.out.println("s1 y s2 son iguales usando equalsIgnoreCase.");
        else
            System.out.println("s1 y s2 no son iguales usando equalsIgnoreCase.");
        
        //comparar las dos cadenas de texto ignorando mayusc. y minusc.
        //sin usar equalsIgnoreCase
        if( s1.toLowerCase().equals( s2.toLowerCase() ) == true )
            System.out.println("s1 y s2 son iguales usando toLowerCase.");
        else
            System.out.println("s1 y s2 no son iguales usando toLowerCase.");
    }    
}
