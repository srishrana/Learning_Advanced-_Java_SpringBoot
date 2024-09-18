import java.util.ArrayList;
import java.util.Arrays;

public class Demo_var {
    public static void main(String[] args) {
        // ArrayList obj=new ArrayList<>();
        int a = 9; // here type is assigned at compile time

        var b = 8;
        int c = 9;
        var d = 10;
        System.out.println(b);
        System.out.println();
        String var = "Navin";
        System.out.println(var);
        int nums[] = new int[10];
        var num = new int[10];
        System.out.println(Arrays.toString(nums));
        System.out.println(num);
        var num1 = new int[10];
        var obj = new Alien();
        // here type is itself inferred by the compiler at run time

    }// ciompiler by itself determines from the value taht which type of value
     // is assigned by the user
}
