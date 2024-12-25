import java.util.ArrayList;
import java.util.Collection;

public class App {
    //Collection interface examples
    public static void main(String[] args) throws Exception {

        // Collection is a interface that provides a set of methods to create and manipulate collections.
        Collection collection1 = new ArrayList<>();
        collection1.add("Dinesh"); // adds element to the collection

        Collection collection2 = new ArrayList<>();
        collection2.add("Ramesh");
        collection2.add("Ganesh");

        collection1.addAll(collection2); // adds all elements of collection2 to collection1

        collection1.contains("Ramesh"); // checks if collection1 contains Ramesh
        collection1.containsAll(collection2); // checks if collection1 contains all elements of collection2

        System.out.println(collection1);
        
        collection1.removeAll(collection2); // removes all elements of collection2 from collection1

        collection1.clear(); // removes all elements from collection1

        collection1.isEmpty(); // checks if collection1 is empty    

        collection1.size(); // returns the size of collection1

        collection1.toArray(); // returns an array of the elements in collection1

        collection1.iterator(); // returns an iterator of the elements in collection1

        collection1.remove("Dinesh"); // removes the element "Dinesh" from collection1

        System.out.println(collection1);
    }

}
