public class anonymous_inner {
    public static void main(String[] args) {
        a obj = new a() {
            // inner class implementation
            // i want my code to run it in my way
            // i am not satisfied with the implemnataion in the parent class

            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();

    }

}

class a {
    public void show() {
        System.out.println("IN a show");
    }
}
