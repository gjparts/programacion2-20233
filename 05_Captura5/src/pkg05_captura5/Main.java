package pkg05_captura5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*En una tienda se da un descuento de acuerdo al monto vendido.
        si el monto es mayor que 10000 entonces damos un descuento del 20%
        sobre el valor de la venta de lo contrario no damos descuento.
        Capturar el monto vendido e imprimir el valor del descuento y el
        valor final a pagar. ejemplo:

        Digitar monto vendido: 15000
        El descuento es: 3000
        El valor a pagar es: 12000

        otro ejemplo:
        Digitar monto vendido: 10000
        El descuento es: 0
        El valor a pagar es: 10000

        otro ejemplo:
        Digitar monto vendido: 5000
        El descuento es: 0
        El valor a pagar es: 5000*/
        Scanner s = new Scanner(System.in);
        float monto, descuento = 0;
        System.out.print("Digitar monto vendido: ");
        monto = s.nextFloat();
        
        if( monto > 10000 )
            descuento = monto*0.20f;
        
        System.out.println("El descuento es: "+descuento);
        System.out.println("El valor a pagar es: "+(monto-descuento));
    }
    
}
