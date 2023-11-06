package pkg31_string6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //metodo REPLACE
        //reemplaza texto de un String sin ignorar mayusc./minusc.
        //cuando no algo no ignora mayusc./minusc. se le conoce como
        //Case Sensitive
        String str = "Roja es la Manzana, la manzana es Roja.";
        System.out.println("Contenido de str: "+str);
        
        //reemplazar Roja por Verde, alterando la cadena original
        str = str.replace("Roja", "Verde");
        System.out.println("Contenido de str: "+str);
        
        //reemplazar Manzana por Pera
        str = str.replace("Manzana", "Pera");
        System.out.println("Contenido de str: "+str);
        
        //reemplazar Manzana por Pera, ignorando mayusc./minusic.
        //OJO: esto altera la capitalizacion de la cadena
        str = str.toLowerCase().replace("manzana", "Pera");
        System.out.println("Contenido de str: "+str);
        
        /*Leer un String y luego reemplazar todas las letras a por 4,
        todas las letras e por 3 y todas las letras i por 1 alterando
        el String original ignorando mayusc/minusc., luego imprimirla.
        ejemplo:
        Digitar String: ArlequiN
        Resultado: 4rl3qu1N*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar String: ");
        String cadena = s.nextLine();
        
        cadena = cadena.replace("A", "4");
        cadena = cadena.replace("a", "4");
        cadena = cadena.replace("E", "3");
        cadena = cadena.replace("e", "3");
        cadena = cadena.replace("I", "1");
        cadena = cadena.replace("i", "1");
        
        System.out.println("Resultado: "+cadena);
    }    
}
