package pkg27_string02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Captura de String por medio del Scanner
        Scanner s = new Scanner(System.in);
        String cadena;
        
        System.out.print("Digitar un String: ");
        cadena = s.nextLine();
        
        System.out.println("Tamaño del String: "+cadena.length());
        System.out.println("Version en Mayusc. del String: "+cadena.toUpperCase());
        System.out.println("Version en Minusc. del String: "+cadena.toLowerCase());
        System.out.println("String com trim: "+cadena.trim());
        System.out.println("Tamaño de String com trim: "+cadena.trim().length());
        
        /*IMPORTANTE: cuando se captura datos en la consola del sistema
        si venimos de leer un numero y luego leemos un String, el buffer
        de entrada se llena y ocurre un error de ejecucion.*/
        int x;
        System.out.print("Digitar un entero: ");
        x = s.nextInt();
        
        //solucion: depsues de leer el numero, ejecutar un nextLine()
        //sin asignacion a variable para vaciar el input buffer
        s.nextLine();
        
        System.out.print("Digitar un String: ");
        cadena = s.nextLine();
        
        System.out.println("Numero leido: "+x);
        System.out.println("String leido: "+cadena);
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
