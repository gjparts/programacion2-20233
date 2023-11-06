package pkg30_string5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Leer una cadena de texto y mostrar cuantas
        veces sale la letra n dentro de ella,
        ignorando mayusculas y minusculas.*/
        Scanner s = new Scanner(System.in);
        String str;
        int contador = 0;
        
        System.out.print("Digitar String: ");
        str = s.nextLine();
        
        for( int i = 0; i < str.length(); i++ )
        {
            if( str.toLowerCase().charAt(i) == 'n' ) //if( str.charAt(i) == 'n' || str.charAt(i) == 'N' )
                contador++;
        }
        System.out.println("La letra n se encontró "+contador+" veces.");
        
        /*leer un String y luego imprimirlo dejando tres espacios
        en blanco entre cada caracter, luego imprimir dicho String
        de forma invertida caracter por caracter. ejemplo:
        Digitar String: Gerardo
        G   e   r   a   r   d   o   
        odrareG*/
        
        //a un String le podemos concatenar elementos char
        String cadena1 = "Gato";
        cadena1 += 's';
        System.out.println(cadena1);
        
        String nueva = "";
        for( int i = 0; i < str.length(); i++ ){
            System.out.print( str.charAt(i)+"   ");
            //puede aprovechar este mismo for para generar una nueva cadena
            //invertrida
            nueva += str.charAt( str.length()-(i+1) );
        }
        System.out.println();
        System.out.println(nueva);
        for( int i = 0; i < str.length(); i++ ){
            System.out.print( str.charAt( str.length()-(i+1) ) );
        }
        System.out.println();
        for( int i = str.length()-1; i>=0; i-- ){
            System.out.print( str.charAt( i ) );
        }
        System.out.println();
        
        
    }    
}
