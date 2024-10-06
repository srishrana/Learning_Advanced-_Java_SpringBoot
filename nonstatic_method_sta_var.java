public class nonstatic_method_sta_var {
    public static void main(String[] args) {
        aStudent student1 = new aStudent();
        student1.studentName = "John";
        student1.displayInfo(student1); // Passing object reference to access static variable
    }
}

class aStudent {
    static String schoolName = "ABC High School"; // Static variable
    String studentName;

    // Non-static method accepting object reference
    void displayInfo(aStudent obj) {
        System.out.println("Student Name: " + studentName);
        System.out.println("School Name: " + obj.schoolName);
        // Using object reference to access static variable
        System.out.println("School Name: " + schoolName);

    }

}