public class throw_key {
    public static void main(String args[])
    int i=20;
    int j=0;
    try{
        j=18/i;
        if(j==0){
    throw new SrishException("Srishti0");
        }
    }
    catch(SrishException e){
        System.out.println("default");
    }
    catch(Exception e){
        System.out.println("something went worng!");
    }
    System.out.println(j);
}

IPC section
4