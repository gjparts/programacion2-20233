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
        System.out.println("El primer char de nuevo es "+nuevo.charAt(0));
        System.out.println("El ultimo char de nuevo es "+nuevo.charAt(nuevo.length()-1));
        
        //obtener las versiones en mayusc. y minusc. de un string
        String str7 = "Gerardo Josue Portillo";
        System.out.println("La cadena str7 en mayusculas: "+str7.toUpperCase());
        System.out.println("La cadena str7 en minusculas: "+str7.toLowerCase());
        System.out.println("Contenido de str7: "+str7);
        //sobre escribir a str7 con su version en mayusculas
        str7 = str7.toUpperCase();
        System.out.println("Contenido de str7: "+str7);
        
        //trim() elimina los espacios iniciales y finales de un String
        String fruta = "          MANZANA VERDE        ";
        System.out.println("Contenido de fruta: "+fruta+".");
        System.out.println("Longitud de fruta: "+fruta.length());
        //imprimir una version de fruta sin relleno de espacios
        System.out.println("fruta con trim: "+fruta.trim()+".");
        System.out.println("Longitud de fruta con trim: "+fruta.trim().length());
        System.out.println("contenido de fruta: "+fruta+".");
        //sobreescribir el contenido de fruta a su version sin espacios de relleno
        fruta = fruta.trim();
        System.out.println("contenido de fruta: "+fruta+".");
        
        String verdura = "    TOMATE     ROJO    ";
        //imprimir la variable verdura sin espacios iniciales y finales,
        //toda en minusculas sin alterar a la variable verdura.
        System.out.println( verdura.trim().toLowerCase() );
        
        
    }    
}
