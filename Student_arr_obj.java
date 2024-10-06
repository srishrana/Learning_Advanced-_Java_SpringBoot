import java.util.Scanner;

class Student_arr_obj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Srish";
        s1.marks = 100;
        s1.rollno = 211214;
        Student s2 = new Student();
        s2.name = "S";
        s2.marks = 10;
        s2.rollno = 11214;
        Student s3 = new Student();
        s3.name = "rish";
        s3.marks = 1;
        s3.rollno = 214;
        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].name + ":" + s[i].rollno + ":" + s[i].marks);
        }

    }

}

class Student {
    int rollno;
    String name;
    int marks;
}
