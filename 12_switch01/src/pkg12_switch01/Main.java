package pkg12_switch01;
import java.util.Random; //importar clase para generar numeros al azar
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que genere un numero al azar
        entre 1 y 7, imprimir un nombre de color de acuerdo al numero
        generado:
        1 = Rojo, 2 = Amarillo, 3 = Azul, 4 = Verde, 5 = Violeta
        6 = Negro, 7 = Blanco
        Restriccion: usar una estructura de seleccion switch.*/
        //crear un objeto de clase Random
        Random generador = new Random();
        //generador.nextInt(Max-Min+1)+Min
        int numero = generador.nextInt(7-1+1)+1;
        
        switch(numero){
            case 1:
                System.out.println("Rojo");
            break;
            case 2:
                System.out.println("Amarillo");
            break;
            case 3:
                System.out.println("Azul");
            break;
            case 4:
                System.out.println("Verde");
            break;
            case 5:
                System.out.println("Violeta");
            break;
            case 6:
                System.out.println("Negro");
            break;
            case 7:
                System.out.println("Blanco");
            break;
            default:
                System.out.println("Numero desconocido");
        }
    }    
}
