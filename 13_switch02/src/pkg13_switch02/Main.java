package pkg13_switch02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que pregunte el numero de un mes, este debe
        ser un numero entero entre 1 y 12
        Luego preguntar el año.
        Posteriormente se imprimira el numero de dias que tiene dicho
        mes en el calendario.
        Para febrero si el año es multiplo de 4 entonces tendra 29 dias
        de lo contrario solo tendra 28 dias.
        Restriccion: realizarlo utilizando una estructura de seleccion switch*/
        Scanner s = new Scanner(System.in);
        int m,a;
        System.out.print("Digitar mes: ");
        m = s.nextInt();
        System.out.print("Digitar año: ");
        a = s.nextInt();
        //validar el mes
        if( m >= 1 && m <= 12 ){
            switch(m){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("Mes tiene 31 dias");
                break;
                case 4: case 6: case 9: case 11:
                    System.out.println("Mes tiene 30 dias");
                break;
                case 2:
                    if( a%4 == 0 )
                        System.out.println("Mes tiene 29 dias");
                    else
                        System.out.println("Mes tiene 28 dias");
                break;
            } //el caso default en JAVA y C++ no es obligatorio
        }
        else
            System.out.println("Mes no valido");
    }    
}
