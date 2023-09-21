/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardojosue;

/**
 *
 * @author Gerardo Portillo
 */
public class GerardoJosue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //comentario de una linea
        
        /*comentario
        de multiples
        lineas*/
        
        //imprimir texto en la consola del sistema y pasar a una nueva linea
        System.out.println("Hola UNAH");
        System.out.println("Ingenieria en Sistemas");
        //imprimir texto en la consola del sistema y no pasar a un nuevo renglon
        System.out.print("Soy Gerardo Portillo");
        System.out.print("Vivo en SPS");
        System.out.println();
        System.out.println("Otra linea");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Texto");
        //usar caracteres de escape
        System.out.print("Soy Estudiante\nVivo en SPS\n");
        System.out.println("Es un dia soleado\nEs un dia bello.");
        
        System.out.println("Num\tNombre\tEdad");
        System.out.println("1\tJosue\t11");
        System.out.println("2\tViena\t14");
        System.out.println("3\tIrene\t40");
        
        int a; //variable declarada sin valor de inicio
        //System.out.println(a); //no se puede operar variables sin inicializar
        a = 12;
        System.out.println(a);
        //variables declaradas con valor de inicio
        int b = 17, c = 100, d = 88, e, f = 890;
        e = 7; ///sobreescritura de variable
        System.out.println("El valor de b es "+b);
        System.out.println( "La suma de a y b es: "+(a+b) );
        
        double d1 = 100.5;
        double d2, d3 = 0.795412545;
        double d4 = Math.PI;
        double d5 = d1+d3;
        System.out.println("El valor de d1 es "+d1);
        System.out.println("El valor de d3 es "+d3);
        System.out.println("El valor de d4 es "+d4);
        System.out.println("El valor de d5 es "+d5);
        
        double d6 = Math.pow(2, 5);
        System.out.println("2 elevado a la 5 potencia: "+d6);
        d6 = Math.pow(d1, 2);
        System.out.println(d1+" elevado al cuadrado es: "+d6);
        d6 = Math.sqrt(d1);
        System.out.println("La raiz cuadrada de "+d1+" es "+d6);
        
        float f1 = 3.1231321f;
        float f2 = 4.0f, f3 = 4, f5 = f1*5;
        System.out.println("El valor de f1 es "+f1);
        System.out.println("El valor de f1 es "+f2);
        System.out.println("El valor de f1 es "+f3);
        System.out.println("El valor de f1 es "+f5);
        
        System.out.println( "La resta de "+f2+" menos "+f1+" es "+(f2-f1) );
        System.out.println( "La division de "+f2+" entre "+f1+" es "+(f2/f1) );
    }
    
}
