package D30;
import java.util.ArrayList;

public class EjercicioMarcas {
    public static void main(String[] args) {
        // 1. Instanciar un ArrayList<> llamado “marcas”
        ArrayList<String> marcas = new ArrayList<>();

        // 2. Agregar 10 marcas
        marcas.add("Sony");
        marcas.add("Nokia");
        marcas.add("Diadora");
        marcas.add("Kodak");
        marcas.add("Panasonic");
        marcas.add("Sega");
        marcas.add("Palm");
        marcas.add("Compaq");
        marcas.add("Motorola");
        marcas.add("Xerox");

        // Imprimir las marcas en consola
        System.out.println("Marcas originales:");
        System.out.println(marcas);

        // 3. Agregar 3 marcas adicionales
        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");

        // Imprimir el nuevo listado en consola
        System.out.println("\nNuevo listado con marcas adicionales:");
        System.out.println(marcas);

        // 4. Corregir el nombre de "Blokbaster" a "Blockbuster"
        marcas.set(marcas.indexOf("Blokbaster"), "Blockbuster");

        // Imprimir el listado corregido en consola
        System.out.println("\nListado corregido:");
        System.out.println(marcas);

        // 5. Eliminar "Carrefour" del listado
        boolean removed = marcas.remove("Carrefour");
        if (removed) {
            System.out.println("\nCarrefour eliminado correctamente:");
            System.out.println(marcas);
        } else {
            System.out.println("\nCarrefour no encontrado en la lista.");
        }

        // 6. Crear una nueva ArrayList para posibles marcas y agregarlas
        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("Atari");
        posiblesMarcas.add("Commodore");

        // Agregar las posibles marcas a la lista principal
        marcas.addAll(posiblesMarcas);

        // 7. Contar y mostrar la cantidad de elementos en la lista
        System.out.println("\nCantidad de elementos en la lista de marcas: " + marcas.size());
    }
}