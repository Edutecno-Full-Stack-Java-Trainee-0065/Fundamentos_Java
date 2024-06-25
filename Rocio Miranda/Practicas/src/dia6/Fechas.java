package dia6;
import java.util.Scanner;
public class Fechas {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese la primera fecha formato DD/MM/AAAA ej: 03/11/1997"); //fecha 1 se ingresa como  una string, ya que tiene otro caracteres aparte de numeros
        String fecha1 = sc.nextLine();
        if (!esFechaValida(fecha1)) {
            System.out.println("Fecha inválida. Procure ingresar una fecha real y usar formato DD/MM/AAAA ej: 03/11/1997 ");
            return;
        }
         // Obtener el día, mes y año de la primera fecha
         int dia1 = Integer.parseInt(fecha1.substring(0, 2));
         int mes1 = Integer.parseInt(fecha1.substring(3, 5));
         int anno1 = Integer.parseInt(fecha1.substring(6));
        /*estamos utilizando substring para extraer el día, el mes y el año de las fechas ingresadas por el usuario, que están en el formato "DD/MM/AAAA".
         * Estamos extrayendo los primeros dos caracteres de la cadena fecha1, que corresponden al día. El primer parámetro de substring especifica el índice inicial (en este caso, 0), 
         * y el segundo parámetro especifica el índice final (en este caso, 2). Esto significa que estamos extrayendo los caracteres desde el índice 0 hasta el índice 1 (no inclusive), 
         * es decir, los dos primeros caracteres.
         * 
         */
         // Solicitar la segunda fecha al usuario
         System.out.println("Ingrese la segunda fecha como DD/MM/AAAA:");
         String fecha2 = sc.nextLine();
         if (!esFechaValida(fecha2)) {
            System.out.println("Fecha inválida.");
            return;
        }
        

         int dia2 = Integer.parseInt(fecha2.substring(0, 2));
         int mes2 = Integer.parseInt(fecha2.substring(3, 5));
         int anno2 = Integer.parseInt(fecha2.substring(6));


         //Colocamos restricciones 
         if (anno1 < anno2) { //si el año 1 es mayor al 2 entonces la primera persona es mayor y así sucesivamente con mes y año.
            System.out.println("La primera persona es mayor");
         } else if (anno1 > anno2) {
            System.out.println("La segunda persona es mayor");
         } else {
            if (mes1 < mes2 ) {
                System.out.println("La primera persona es mayor");
            } else if (mes1 > mes2) {
                System.out.println("La segunda persona es mayor");
            } else {
                if (dia1 < dia2) {
                    System.out.println("la primera persona es mayor");
                } else if (dia1 > dia2) {
                    System.out.println("La segunda persona es mayor");
                } else {
                    System.out.println("Ambas personas tienen la misma edad"); // si todo eso no se cumple, entonces las dos personas tienen la misma edad

                }

                }
            }
            
        sc.close();
    }
    
    public static boolean esFechaValida(String fecha) {

         // Verificar si el formato es correcto
        if (fecha.length() != 10 || fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
             return false; // Formato incorrecto
         }
        try {
            int dia = Integer.parseInt(fecha.substring(0, 2));
            int mes = Integer.parseInt(fecha.substring(3, 5));
            int anno = Integer.parseInt(fecha.substring(6));
    
            if (mes < 1 || mes > 12) {
                return false; // Mes inválido
            }
    
            int maxDias;
            if (mes == 2) {
                maxDias = ((anno % 4 == 0) && (anno % 100 != 0)) || (anno % 400 == 0) ? 29 : 28;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                maxDias = 30;
            } else {
                maxDias = 31;
            }
    
            return dia >= 1 && dia <= maxDias; // Día válido
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return false; // Formato de fecha inválido
        }
    }
}
