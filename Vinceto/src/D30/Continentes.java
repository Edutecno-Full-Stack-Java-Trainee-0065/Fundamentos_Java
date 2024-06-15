package D30;
import java.util.LinkedList;
import java.util.Queue;

public class Continentes {
    public static void main(String[] args) {
        Queue continentes = new LinkedList<>();
        continentes.add("África");
        continentes.add("América");
        continentes.add("Europa");
        continentes.add("Oceanía");
        continentes.add("Asia");
        continentes.add("Antártica");

        System.out.println(continentes.remove("Antártica"));
        System.out.println(continentes);

        System.out.println(continentes.poll());
        System.out.println(continentes);

        System.out.println("peek : " + continentes.peek());
        System.out.println(continentes);

        System.out.println("element: "+continentes.element());
        System.out.println(continentes);

        System.out.println(continentes.size());
    }
}
