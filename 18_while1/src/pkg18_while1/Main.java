package pkg18_while1;
public class Main {
    public static void main(String[] args) {
        /*
        estructuras de repeticion que pueden llegar a ser infinitas:
        while       (pregunta primero, ejecuta despues)
        do-while    (ejecuta primero, pregunta despues)
        
        imprimir los numeros del 0 al 9 de uno en uno usando while
        */
        int x = 0;  //variable de control
        while( x < 10 ){
            System.out.println(x);
            x++;
        }
        
        //imprimir los numeros del 0 al 9 de uno en uno usando do-while
        int y = 0;
        do{
            System.out.println(y);
            y++;
        }while(y < 10);
        
        //imprimir los numeros del 0 al 20 de dos en dos usando while.
        System.out.println("***********************");
        x = 0;  //variable de control
        while( x <= 20 ){
            System.out.println(x);
            x+=2;   //de dos en dos
        }
        
        
        System.out.println("Adios");
    }    
}
