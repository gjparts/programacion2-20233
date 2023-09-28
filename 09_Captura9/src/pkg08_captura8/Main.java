package pkg08_captura8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que pregunte el salario mensual de un empleado
        y su antiguedad en años.
        El programa devolverá el bono anual obtenido de
        multiplicar un salario mensual por el % de bono el cual
        sale de la tabla siguiente:

        Antigüedad			% bono
        menos de 5 años			10%
        de 5 a menos de 10 años		15%
        de 10 a menos de 20 años	20%
        20 años o mas	*/
        Scanner s = new Scanner(System.in);
        double salario, bono = 0;
        int anios;
        System.out.print("Salario Mensual: ");
        salario = s.nextDouble();
        System.out.print("Años: ");
        anios = s.nextInt();
        
        if( anios < 5 ) bono = salario*0.10;
        if( anios >= 5 && anios < 10 ) bono = salario*0.15;
        if( anios >= 10 && anios < 20 ) bono = salario*0.20;
        if( anios >= 20 ) bono = salario*0.25;
        
        System.out.println("El bono anual es: "+bono);
    }
    
}
