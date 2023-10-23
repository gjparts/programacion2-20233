package pkg22_break1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que lea 100 numeros positivos, al finalizar la lectura
        el programa mostrara la suma de los numeros positivos leidos.
        -> si durante la lectura de los 100 numeros se digitara un numero menor
        que cero entonces no continuar con la lectura de los numeros.
        -> desarrollarlo utilizando una estructura de repeticion for.*/
        Scanner s = new Scanner(System.in);
        int numero; //variable para leer numeros
        int suma = 0; //var. acumulador
        //100 iteraciones (potencialmente)
        for( int i = 1; i <= 100; i++ ){
            System.out.print("digitar numero positivo: ");
            numero = s.nextInt();
            
            //si se digita un numero negativo se termina la estructura
            //sino entonces se suma
            if( numero >= 0 )
                suma += numero;
            else
                break;  //termina la estructura for
        }
        System.out.println("Suma: "+suma);
    }    
}
