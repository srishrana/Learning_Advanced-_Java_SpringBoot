import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    @Override
    public int compareTo(Student o) {
        Object i;
        Object j;
        if(o.age> o.age){
          return 1;
        }
          else
          return -1;
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}

public class sorting_concept {
    public static void main(String[] args) {
        // Comparator to sort students based on the last digit of their age
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                return Integer.compare(i.age % 10, j.age % 10);
            }
        };

        // Create a list of Student objects
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(22, "Alice"));
        studs.add(new Student(34, "Bob"));
        studs.add(new Student(45, "Charlie"));
        studs.add(new Student(29, "David"));
        studs.add(new Student(31, "Eve"));

        // Sort the list using the comparator
        Collections.sort(studs, com);

        // Iterate over the sorted list and print each Student
        for (Student s : studs) {
            System.out.println(s);
        }
    }
}
