package pkg14_for1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1) imprimir los numeros del 1 al 10 de uno en uno
        for(int i = 1; i <= 10; i++)
            System.out.println(i);
        
        //2) imprimir los numeros del 0 al 50 de dos en dos
        //26 iteraciones
        for(int i = 0; i <= 50; i+=2)
            System.out.println(i);
        
        //3) imprimir los numeros del 0 al 50 de cinco en cinco
        //11 iteraciones
        for(int i = 0; i <= 50; i+=5)
            System.out.println(i);
        
        //forma ineficiente: (no esta mal)
        //hace 51 iteraciones
        for(int i = 0; i <= 50; i++){
            if(i%5 == 0)
                System.out.println(i);
        }
        
        //4) recorrer los numeros del 0 al 50;
        //pero solo imprimir los numeros impares.
        //51 iteraciones
        for(int i = 0; i <= 50; i++){
            if(i%2 == 1) //if(i%2 != 0)
                System.out.println(i);
        }
        
        /*5) imprimir los numeros del 1 al 100;
        colocar un asterisco a la derecha de
        aquellos numeros que son multiplo de 10*/
        //100 iteraciones
        for(int i = 1; i <= 100; i++){
            if( i%10 == 0 )
                System.out.println(i+"*");
            else
                System.out.println(i);
        }
        
        //version un poquito mas optima
        //100 iteraciones
        for(int i = 1; i <= 100; i++){
            System.out.print(i);
            if( i%10 == 0 )
                System.out.print("*");
            System.out.println("");
        }
        
        /*6) imprimir los numeros del 10 al 1,
        de forma descendente de uno en uno*/
        for(int i = 10; i >= 1; i--)
            System.out.println(i);
        
        /*7) imprimir los numeros del 10 al 0,
        de forma descendente de dos en dos*/
        for(int i = 10; i >= 0; i-=2)
            System.out.println(i);
        
        /*8) imprimir los numeros del 100 al 0,
        de forma descendente de diez en diez*/
        for(int i = 100; i >= 0; i-=10)
            System.out.println(i);
        
        //extra: for tambien puede trabajar incrementos en decimales
        //imprimir los numeros de 0 a 10 de 0.5 en 0.5
        for( float i = 0; i <= 10; i+=0.5f )
            System.out.println(i);
        
        //imprimir los numeros de 0 a 10 de 0.25 en 0.25
        for( double i = 0; i <= 10; i+=0.25 )
            System.out.println(i);
        
        /*9) Hacer un programa que pida al usuario 10 numeros enteros,
        al finalizar el programa imprimira la suma de esos
        10 numeros, asi como cual es el mayor de los 10 numeros.*/
        Scanner s = new Scanner(System.in);
        int numero; //variable para leer numeros
        int mayor = 32321; //variable bandera para determinar el numero mas grande
        int suma = 0;   //variable acumulador
        
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digitar numero: ");
            numero = s.nextInt();
            suma += numero; //sumar numero recien leido al acumulador
            //si es la primera iteracion, el numero leido
            //es el numero mayor hasta ese momento
            if( i == 1 )
                mayor = numero;
            else{
                if( numero > mayor )
                    mayor = numero;
            }
        }
        System.out.println("La suma es: "+suma);
        System.out.println("La mayor es: "+mayor);
    }
    
}
