package pkg28_string3;
public class Main {
    public static void main(String[] args) {
        //conversiones
        //convertir de String a Entero
        String cadena1 = "100";
        int entero1 = Integer.parseInt(cadena1);
        System.out.println(entero1+1);
        
        //convertir de String a Float
        String cadena2 = "3.1416";
        float flotante1 = Float.parseFloat(cadena2);
        System.out.println(flotante1+100);
        
        //convertir de String a Double
        String cadena3 = "2.45689";
        double doble1 = Double.parseDouble(cadena3);
        System.out.println(doble1+500);
        
        //de tipo numerico a String
        String cadenax, cadenay, cadenaz;
        int entero2 = 78;
        float flotante2 = 9.987987f;
        double doble2 = 5.252627;
        cadenax = String.valueOf(entero2);
        System.out.println("cadenax: "+cadenax);
        cadenay = String.valueOf(flotante2);
        System.out.println("cadenay: "+cadenay);
        cadenaz = String.valueOf(doble2);
        System.out.println("cadenaz: "+cadenaz);
    }    
}
