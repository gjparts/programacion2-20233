package pkg35_stringx;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*SPLIT
        convierte un String en un arreglo de String dividiendola
        en elementos delimitados por un token.*/
        String str = "Mi nombre es Gerardo Portillo";
        //declarar un arreglo sin inicializar
        //a donde depositaremos el resultado de split
        String arreglo[];
        //ejecutar el split en la cadena deseada
        //en este caso 1 espacio en blanco sera mi token
        arreglo = str.split(" ");
        //imprimir todos los elementos del arreglo
        for( int i = 0; i < arreglo.length; i++ )
            System.out.println("Posicion "+i+"\tValor: "+arreglo[i]+".");
        
        //otro ejemplo
        str = "13_Gerardo Portillo_1000_1730_20231109";
        arreglo = str.split("_");
        System.out.println("*********************");
        for( int i = 0; i < arreglo.length; i++ )
            System.out.println("Posicion "+i+"\tValor: "+arreglo[i]+".");
        
        //otro ejemplo
        str = "Coca ColaSEPARADOR5SEPARADOR55SEPARADOR275";
        arreglo = str.split("SEPARADOR");
        System.out.println("*********************");
        for( int i = 0; i < arreglo.length; i++ )
            System.out.println("Posicion "+i+"\tValor: "+arreglo[i]+".");
        
        //otro ejemplo
        str = "13|Gerardo Portillo|1000|1730|20231109";
        str = str.replace("|", "_");
        arreglo = str.split("_");
        System.out.println("*********************");
        for( int i = 0; i < arreglo.length; i++ )
            System.out.println("Posicion "+i+"\tValor: "+arreglo[i]+".");
        
        /*Hace un programa que pregunte un String al usuario,
        el programa dira cuantas palabras tiene el String
        tomando en cuenta que cada palabra se separara por solo un espacio
        en blanco.
        Ejemplo:
        Digitar String:Gerardo Josue Portillo
        numero de palabras: 3
        
        otro ejemplo:
        Digitar String:Ingenieria En Sistemas .
        numero de palabras: 4*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar String:");
        str = s.nextLine();
        System.out.println("numero de palabras: "+str.split(" ").length);
        
        arreglo = str.split(" ");
        System.out.println("numero de palabras: "+arreglo.length);
        
    }    
}
