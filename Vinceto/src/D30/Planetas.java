package D30;
import java.util.Map;
import java.util.TreeMap;

public class Planetas {
    public static void main(String[] args) {
        Map<String, Integer> planetas = new TreeMap<>();
        planetas.put("Mercurio", 10);
        planetas.put("Venus", 20);
        planetas.put("Marte", 15);
        planetas.put("Jupiter", 50);
        System.out.println(planetas);

        planetas.remove("Venus");
        System.out.println(planetas);

        System.out.println(planetas.get("Jupiter"));


        System.out.println(planetas.containsKey("Tierra"));
        System.out.println(planetas.containsKey("Jupiter"));

        planetas.keySet().forEach(key -> System.out.println(key));

        for (Map.Entry<String, Integer> entry : planetas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }
}

