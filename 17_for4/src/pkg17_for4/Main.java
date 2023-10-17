package pkg17_for4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //for anidado (nested)
        /*Hacer un programa que pida al usuario un ancho y un alto
            como numeros enteros. El programa debe imprimir
            un rectangulo relleno de asteriscos
            en base al alto y ancho digitados.*/
        Scanner s = new Scanner(System.in);
        int alto, ancho;
        System.out.print("Digitar el alto: ");
        alto = s.nextInt();
        System.out.print("Digitar el ancho: ");
        ancho = s.nextInt();
        
        //for principal: lineas
        for( int i = 1; i <= alto; i++ ){
            //for anidado: asteriscos por linea
            for( int j = 1; j <= ancho; j++ ){
                System.out.print("*");
            }
            System.out.println();   //pasar a linea siguiente
        }
    }
    
}
