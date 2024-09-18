
// import java.util.Arrays;

enum status {
    Pending, Running, Failed, Success
}

public class enum1 {
    public static void main(String[] args) {
        int i = 5;
        // status s = status.Success;
        // System.out.println(s);
        // status[] ss = status.values();
        // // System.out.println(ss);
        // for (status s1 : ss) {
        // System.out.println(s1 + " :" + s1.ordinal());
        // // System.out.println(Arrays.toString(ss));

        // // enum with help of if else
        status s = status.Pending;
        // if (s == status.Running) {
        // System.out.println("allgood");
        // }
        // if (s == status.Failed) {
        // System.out.println("try again");
        // }
        // if (s == status.Pending) {
        // System.out.println("pls wait");
        // } else {
        // System.out.println("done");
        // }

        System.out.println(s.getClass().getSuperclass());

        // enum with help of switch case
        switch (s) {
            case Running:
                System.out.println("all good");
                break;
            case Pending:
                System.out.println("pls wait");
                break;
            case Failed:
                System.out.println("try again");
                break;
            default:
                System.out.println("done");
        }

    }

}
