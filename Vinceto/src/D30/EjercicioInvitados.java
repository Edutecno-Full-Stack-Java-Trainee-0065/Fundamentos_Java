package D30;
import java.util.Set;
import java.util.TreeSet;

public class EjercicioInvitados {
    public static void main(String[] args) {
        // 1. Instanciar un TreeSet<> llamado “invitados”
        Set<String> invitados = new TreeSet<>();

        // 2. Agregar nombres al TreeSet
        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        // Imprimir invitados ordenados
        System.out.println("Invitados originales:");
        System.out.println(invitados);

        // 3. Crear un nuevo set para posibles invitados no deseados
        Set<String> posiblesNoDeseados = new TreeSet<>();
        posiblesNoDeseados.add("Jorge");
        posiblesNoDeseados.add("Francisco");
        posiblesNoDeseados.add("Marcos");

        // Agregar posibles no deseados al set principal
        invitados.addAll(posiblesNoDeseados);

        // Imprimir el listado final de invitados
        System.out.println("\nListado final de invitados:");
        System.out.println(invitados);

        // 4. Eliminar a "Jorge" del listado de invitados
        invitados.remove("Jorge");

        // Imprimir el listado final después de eliminar a "Jorge"
        System.out.println("\nListado final después de eliminar a Jorge:");
        System.out.println(invitados);
    }
}
