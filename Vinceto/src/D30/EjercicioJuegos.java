package D30;

import java.util.Queue;
import java.util.LinkedList;

public class EjercicioJuegos {
    public static void main(String[] args) {
        // 1. Instanciar un Queue<> llamado “juegos” con LinkedList()
        Queue<String> juegos = new LinkedList<>();

        // 2. Agregar juegos al Queue
        juegos.offer("Tombo");
        juegos.offer("Congelado");
        juegos.offer("Quemaditas");
        juegos.offer("Cachipún");
        juegos.offer("Pillarse");

        // 3. Contar y mostrar la cantidad de juegos encolados
        System.out.println("Cantidad de juegos en la lista: " + juegos.size());

        // Mostrar los juegos encolados
        System.out.println("\nLista de juegos:");
        while (!juegos.isEmpty()) {
            System.out.println(juegos.poll());
        }
    }
}
