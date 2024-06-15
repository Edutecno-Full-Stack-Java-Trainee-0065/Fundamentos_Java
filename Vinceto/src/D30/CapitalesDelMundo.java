package D30;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CapitalesDelMundo {
    public static void main(String[] args) {
        Set<String> capitales = new TreeSet<>();
        capitales.add("Buenos Aires");
        capitales.add("Brasilia");
        capitales.add("Asunción");
        capitales.add("Lima");
        Set<String> capitales2 = new HashSet<>(Arrays.asList("Caracas", "Bogotá",
                "Montevideo","Quito", "Brasilia"));
        Set<String> capitalesUnidas = new TreeSet<>(capitales);
        capitalesUnidas.addAll(capitales2);
        System.out.println(capitalesUnidas);

        Set<String> removerCapitales = new HashSet<>(capitales);
        removerCapitales.removeAll(capitales2);
        System.out.println(removerCapitales);

        Set<String> interseccionCapitales = new HashSet<>(capitales);
        interseccionCapitales.retainAll(capitales2);
        System.out.println(interseccionCapitales);
    }
}
