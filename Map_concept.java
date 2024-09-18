import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Map_concept {
    public static void main(String[] args) {
        // Creating a Map instance
        Map<String, Integer> students = new Hashtable();
        // Map<String, Integer> students = new HashMap<>();

        // Adding key-value pairs to the map
        students.put("Navin", 56);
        students.put("Najn", 42);
        students.put("Nnnmi", 45);
        students.put("N", 85);
        students.put("Nerfvr", 45);
        students.put("Navin", 65);

        // Printing the map
        System.out.println(students);
        // System.out.println(students.get("Navin"));

        System.out.println(students.keySet());
        for (String key : students.keySet()) {

            System.out.println(key + " " + students.get(key));
        }
    }
}
