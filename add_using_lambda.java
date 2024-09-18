public class add_using_lambda {
    public static void main(String[] args) {
        // a obj=new a(){
        // public int add(int i,int j){
        // return i+j;
        // }
        // };
        // int result=obj.add(5,4);
        // System.out.println(result);

        // using lambda expression here
        a obj = (int i, int j) -> i + j;
    };

}

@FunctionalInterface
interface a {
    int add(int i, int j);
}
