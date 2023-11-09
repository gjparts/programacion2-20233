package pkg34_string9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*substring (substr)
        Devuelve un String que esta dentro de otro String
        pero incluyendo los caracteres que se encuentran
        entre una posicion de inicio y una posicion de fin*/
        String str = "Ingenieria en Sistemas";
        System.out.println("La subcadena desde 0 hasta 6 es: "+str.substring(0, 6));
        System.out.println("La subcadena desde 9 hasta 16 es: "+str.substring(9, 16));
        System.out.println("La subcadena desde 0 hasta 22 es: "+str.substring(0,22));
        /*Leer un numero de cedula de Honduras, el programa
        unicamente debe validar que este numero tenga 13 digitos.
        * el programa deberá eliminar los espacios de relleno, güiones,
          güiones bajos, espacios en blanco de la cadena.
        
        *Luego de leer la cedula mostrar la informacion siguiente:
        1) numero de departamento
        2) numero de municipio
        3) año de asentamiento
        4) correlativo en que fue asentado
        
        ejemplo:
        Digitar cedula: 1401-1982-01055
        Resultado:
        Departamento: 14
        Municipio: 01
        Año de asentamiento: 1982
        Correlativo: 01055*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar DNI: ");
        String dni = s.nextLine();
        
        //eliminar guiones, espacios y relleno
        dni = dni.replace("-", "").replace(" ", "").replace("_", "");
        
        //validacion
        if( dni.length() == 13 ){
            System.out.println("Resultado:");
            String depto, muni, correlativo;
            int anio;
            depto = dni.substring(0,2);
            muni = dni.substring(2,4);
            anio = Integer.parseInt( dni.substring(4,8) );
            correlativo = dni.substring(8,13);
            
            System.out.println("Departamento: "+depto);
            System.out.println("Municipio: "+muni);
            System.out.println("Año: "+anio);
            System.out.println("Correlativo: "+correlativo);
        }
        else
            System.out.println("DNI no es valido, debe tener 13 caracteres.");
    }
    
}
