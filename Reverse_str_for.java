public class Reverse_str_for {
    public static void main(String[] args) {
        String str = "Srishti", nstr = " ";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = nstr + ch;
        }
        System.out.println(nstr);

    }
}
