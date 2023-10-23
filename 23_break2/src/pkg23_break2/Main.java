package pkg23_break2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Se cuenta con 50 bonos de L. 100 cada uno,
        Una persona puede usarlos para pagar su carrito de supermercado.
        Hacer un programa que pregunte cuanto se gastó en el supermercado.
        el programa recorrera los 50 bonos e ira restando cada uno al valor
        de la compra de supermercado.
        -> Al termina el programa dira cuanto de la deuda se logro
        pagar con los bonos.
        -> Si sobran bonos entonces se dirá que el cliente tiene un
        credito a su favor y mostrar el valor de dicho credito.
        -> Si los bonos no alcanzan entonces mostrar el valor que la
        persona debera pagar para honrar el gasto del carrito de supermercado.
        -> un bono no se puede usar por menos de L.100
        Resolver utilizando una estructura for.*/
        Scanner s = new Scanner(System.in);
        float monto;    //monto de la compra de supermercado
        float aFavor = 0.00f;    //monto a favor del cliente
        System.out.print("Monto de la compra: ");
        monto = s.nextFloat();
        
        //recorrer los 50 bonos (cada uno vale 100)
        for( int i = 1; i <= 50; i++ ){
            monto -= 100;
            //si ya no hay monto para pagar entonces no seguimos restando
            //bonos de L. 100
            //un bono no se puede usar por menos de L.100
            if( monto < 100 ){
                aFavor = (50-i)*100;
                break;
            }
        }
        System.out.println("Valor a pagar por cliente: "+Math.abs(monto));
        System.out.println("Bonos a favor del cliente: "+aFavor);
    }    
}
