 interface Data {

    int myData=100; // here by default are  public static final

    public void show()
    {

    }
}
public class InterfaceTest {
 
    public static void main(String[] args) {
        
        System.out.println(""+Data.myData ); // static so access with the help of clas name
       // System.out.println(Data.myData=100); // final so cant modified.

    }
}
