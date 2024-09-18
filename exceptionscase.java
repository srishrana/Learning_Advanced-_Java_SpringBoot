// import java.lang.ArithmeticException;
//crating my own exception
class SrishtiException extends Exception { // you can also extends Runtime exception
    public SrishtiException(String str) {
        super(str);
    }
}

public class exceptionscase {
    public static void main(String[] args) {
        // System.out.println(2+2);
        int i = 0;

        int nums[] = new int[5];
        try {

            int j = 18 / i; // will throw arithmetic exception
            // // System.out.println(nums[1]);
            // System.out.println(nums[5]);
            if (j == 0)
                throw new SrishtiException("Srishti");
        } catch (SrishtiException e) {
            System.out.println("this is the default messsage" + e);
        }

        catch (ArithmeticException e) {
            int j = 18 / 1;
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("something went wrong!");
            System.out.println(e);
        }

        // what if value of i=0;
        // System.out.println(j);
        System.out.println("bye");

    }
}
