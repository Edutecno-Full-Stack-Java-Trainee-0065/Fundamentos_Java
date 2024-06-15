package D30;
import java.util.Map;
import java.util.TreeMap;

public class EjercicioGolosinas {
    public static void main(String[] args) {
        // 1. Instanciar un TreeMap<> llamado “golosinas”
        Map<String, Integer> golosinas = new TreeMap<>();

        // 2. Agregar golosinas con precios
        golosinas.put("Chocman", 100);
        golosinas.put("Trululú", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga Traga", 150);
        golosinas.put("Tabletón", 5);

        // Imprimir golosinas ordenadas por clave
        System.out.println("Golosinas originales:");
        System.out.println(golosinas);

        // 3. Filtrar golosinas por precio menor a 100 pesos
        System.out.println("\nGolosinas con precio menor a 100 pesos:");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            if (entry.getValue() < 100) {
                System.out.println(entry.getKey() + " - $" + entry.getValue());
            }
        }
    }
}
