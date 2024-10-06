import java.util.*;

public class Stud_sort_comp {
    public static void main(String[] args) {

        // Corrected Comparator for Student
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if (i.age > j.age) {
                    return 1; // Sort by ascending age
                } else {
                    return -1;
                }
            }
        };

        // List of Students
        List<Student> stud = new ArrayList<>();
        stud.add(new Student("navin", 21));
        stud.add(new Student("nav", 23));
        stud.add(new Student("na", 20));
        stud.add(new Student("n", 25));

        // Sorting the list using the comparator
        Collections.sort(stud, com);

        // Printing the sorted list
        for (Student s : stud) {
            System.out.println(s);
        }
    }
}

// Student class with toString() method for proper output
class Student {
    int age;
    String name;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}
