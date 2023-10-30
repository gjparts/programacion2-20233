package pkg26_string01;
public class Main {
    public static void main(String[] args) {
        /*String (cadena de texto)
        -> Es una coleccion de elementos char
        -> en JAVA es un tipo de dato compuesto, parte de una clase
        -> sus elementos se numeran de 0 a N-1 (Zero indexing)*/
        //declaracion
        String cadena;
        String cadena2 = "Gerardo Portillo";
        String c1, c2 = "", c3 = "Pera";
        //System.out.println(cadena); //no se puede imprimir si no inicializa
        System.out.println(cadena2);
        System.out.println("El valor de c3 es "+c3);
        
        //generar un nuevo String a partir de otros String
        String str1 = "UNAH", str2 = "Sistemas";
        String nuevo = "Bienvenido a "+str2+" en la "+str1;
        System.out.println(nuevo);
        
        //saber el tamaño de un String
        System.out.println("La cadena nuevo tiene "+nuevo.length()+" caracteres");
        
        //leer cada char del String uno por uno
        for( int i = 0; i < cadena2.length(); i++ )
        {
            System.out.println( cadena2.charAt(i) );
        }
    }    
}
