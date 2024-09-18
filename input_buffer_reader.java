import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class input_buffer_reader {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        // int num=bf.readLine();
        // bf.readline(0 actually returns a string value ; but we need an interger
        // this si where Integer.parseINt() function comes into play
        // converts it itno interger
        System.out.println("Enter a num");
        int num = 0;
        try {
            String str = bf.readLine();
            num = Integer.parseInt(str);
            throw new IOException();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        // bf.close();

    }

    // int num=Integer.parseInt(bf.readLine());
    // System.out.println(num);
    // }
}
