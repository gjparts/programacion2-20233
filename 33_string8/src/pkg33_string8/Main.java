package pkg33_string8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*el metodo contains
        Devuelve true si se ha encontrado una cadena dentro de otra.
        No ignora mayusculas/minusculas.*/
        String str = "Veo un MAngo maduro en el arbol del parque.";
        System.out.println("Contenido de str: "+str);
        System.out.println("Contiene mango: "+str.contains("mango"));
        System.out.println("Contiene Mango: "+str.contains("Mango"));
        System.out.println("Contiene mango (ignorando mayusc/minusc.): "
                +str.toLowerCase().contains("mango"));
        
        /*preguntar al usuario: ¿que desea buscar dentro de str?
        ignorando mayusculas/misnuculas
        si lo que el usuario desea buscar se encuentra entonces
        responder: "Texto encontrado"
        del lo contrario responder: "Texto no se encontró"*/
        Scanner s = new Scanner(System.in);
        System.out.print("¿que desea buscar dentro de str? ");
        String buscar = s.nextLine();
        if( str.toLowerCase().contains( buscar.toLowerCase() ) == true )
            System.out.println("Texto encontrado");
        else
            System.out.println("Texto no se encontró");
        System.out.println("Contenido de str: "+str);
    }
    
}
