import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SetExp {
    public static void main(String[] args) {

        Consumer consume= name ->System.out.println(name);

        Predicate filterPredicate =new Predicate<String>() {
            public boolean test(String name) {
                return name == null;
            }
        };

        Set<String> names = new HashSet();
        names.add("Dinesh");
        names.add("Ganesh");
        names.add("null");
        names.forEach(consume);
        names.stream().filter(filterPredicate).forEach(consume);
        System.out.println(names.stream().findAny().toString());
        // System.out.println(names);
    }
}
