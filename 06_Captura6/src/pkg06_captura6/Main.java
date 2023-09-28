package pkg06_captura6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Leer las 3 calificaciones parciales como numeros double y mostrar el
        promedio obtenido en la clase. 
        En la nota de promedio no se permite numeros decimales, debera
        redondear al proximo entero.
        Si el promedio ya redondeado es mayor o igual a 65
	mostrar mensaje APROBADO sino, mostrar el mensaje REPROBADO*/
        Scanner x = new Scanner(System.in);
        double n1, n2, n3, promedio;
        System.out.print("Parcial 1: ");
        n1 = x.nextDouble();
        System.out.print("Parcial 2: ");
        n2 = x.nextDouble();
        System.out.print("Parcial 3: ");
        n3 = x.nextDouble();
        
        promedio = Math.round( (n1+n2+n3)/3.0 );
        
        System.out.println("El promedio es: "+promedio);
        if( promedio >= 65 ){
            System.out.println("El estudiante");
            System.out.println("ha sido");
            System.out.println("aprobado");
        }
        else{
            System.out.println("El estudiante");
            System.out.println("ha sido");
            System.out.println("reprobado");
        }
    }
    
}
