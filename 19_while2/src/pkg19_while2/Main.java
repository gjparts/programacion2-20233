package pkg19_while2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que lea N cantidad de numeros positivos.
        La lectura de numeros terminara cuando se lea un numero negativo.
        Una vez concluida la lectura de numeros mostraremos la suma de los
        numeros positivos capturados*/
        Scanner s = new Scanner(System.in);
        //usando while
        double numero = 777; //variable para leer numeros (variable control)
        double suma = 0; //variable acumulador
        
        while(numero >= 0){
            System.out.print("Digitar un numero positivo: ");
            numero = s.nextDouble();
            
            if( numero >= 0 ) //si el numero recien leido es positivo...
                suma += numero; //...sumarlo
        }
        System.out.println("Suma: "+suma);
        
        //usando do-while
        System.out.println("************************");
        double cifra;   //variable de control y para leer numeros
        double sumatoria = 0; //variable acumulador
            
        do{
            System.out.print("Digitar un numero positivo: ");
            cifra = s.nextDouble();
            
            if( cifra >= 0 )
                sumatoria += cifra;
            
        }while(cifra >= 0);
        System.out.println("Suma: "+sumatoria);
    }
    
}
