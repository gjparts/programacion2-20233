package pkg11_or_and;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Una tienda da un descuento del 10% a personas
        cuya edad este entre 18 y 21 o entre 35 y 59.
        Preguntar al usuario la edad y el monto de la venta.
        Imprimir lo que tiene que pagar y el monto del
        descuento otorgado.*/
        Scanner s = new Scanner(System.in);
        double monto, descuento;
        int edad;
        System.out.print("Digitar edad del comprador: ");
        edad = s.nextInt();
        System.out.print("Digitar el monto de la venta: ");
        monto = s.nextDouble();
        //determinar el descuento
        if( ( edad >= 18 && edad <= 21 ) || ( edad >= 35 && edad <= 59 ) )
            descuento = monto*0.10;
        else
            descuento = 0.00;
        
        System.out.println("El descuento es "+descuento);
        System.out.println("El valor a pagar es "+(monto-descuento));
    }
    
}
