abstract class AbstractClass
{
    int data=100;

    public AbstractClass()
    {
        System.out.println("This is default construtor");
    }
   
}

public interface InnerMain1 {

    int num=10;
    
}
class bike extends AbstractClass
{
  // super()
}
public class Main1 {
    public static void main(String[] args) {

       // AbstractClass clas=new AbstractClass(); //we we declare the abstract class 
        //we cant create the object of that class.
        bike bike=new bike();
        int result=bike.data=200; //modify the value 
        System.out.println(result);
        
    }
}
