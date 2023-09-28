package pkg04_captura4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b,c, discriminante, x1, x2;
        //entrada
        System.out.print("a: ");
        a = s.nextDouble();
        System.out.print("b: ");
        b = s.nextDouble();
        System.out.print("c: ");
        c = s.nextDouble();
        
        //validacion de los datos
        //a no puede ser cero
        if( a == 0 )
            System.out.println("a no puede ser CERO.");
        else
        {   
            discriminante = Math.pow(b, 2)-4*a*c;
            if( discriminante < 0 )
                System.out.println("El discriminante es negativo.");
            else
            {
                //procesamiento
                
                x1 = (-b+Math.sqrt(discriminante))/(2*a);
                x2 = (-b-Math.sqrt(discriminante))/(2*a);
                //salida
                System.out.println("x1: "+x1);
                System.out.println("x2: "+x2);
            }
        }
    }
    
}
