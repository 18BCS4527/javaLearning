/**
 * InnerInterfaceExp
 */
interface Student3 {
    public String getName();
}
interface Student4 {
    public String getName();
}
public class InterfaceExp implements Student3 , Student4{

    /**
     * Multiple inheritance is not supported in the case of class because of ambiguity. 
     * However, it is supported in case of an interface because there is no ambiguity. 
     * It is because its implementation is provided by the implementation class.
     */
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        System.out.println("Dinesh Reddy");
        return "Dinesh Reddy";
    }

}
