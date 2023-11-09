package pkg32_string7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*leer una cadena de texto, y reemplazar dentro de ella todos
        los espacios en blanco por guiones bajos
        alterando la cadena original, ejemplo:
        Digitar String: Gerardo Josue Portillo
        resultado: Gerardo_Josue_Portillo*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar String: ");
        String str = s.nextLine();
        //hacer el reemplazo
        str = str.replace(" ", "_");
        System.out.println("resultado: "+str);
    }
    
}
