package pkg24_break3;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //hacer un while infinito
        //el while se puede romper si adivina el numero secreto
        //el numero secreto es un valor al azar entre 1 y 5
        //el numero al azar se cambiara en cada vuelta
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int numero, azar;
        
        while(true){
            azar = r.nextInt(5-1+1)+1;
            System.out.print("Adivine un numero entre 1 y 5: ");
            numero = s.nextInt();
            
            if( azar == numero ) break;
        }
        System.out.println("Felicidades, has escapado.");
    } 
}
