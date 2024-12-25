abstract class Student2{
    public abstract void display();
    public void Add(){
        System.out.println(2+5);
    }
}
/**
 * InnerAbstractExp
 */
interface InnerAbstractExp {
    public void display();    
}
public class AbstractExp extends Student2 implements InnerAbstractExp {

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        AbstractExp obj = new AbstractExp();
        obj.display();
    }
}
