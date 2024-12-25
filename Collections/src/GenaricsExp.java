class Student<T,U>{
    T type1;
    U type2;

    public Student(T type1, U type2) {
        this.type1 = type1;
        this.type2 = type2;
    }
    @Override
    public String toString() {
        return "Student [type1=" + type1.getClass().getName() + ", type2=" + type2.getClass().getName() + "]";
    }

    
}
public class GenaricsExp {
    /*Generics is parameterized type. The idea behind generics is to allow types 
    (int,string or userdefined types) to be used as parameters to methods ,classes and interfaces.
     ** By Using generics we can achieve compile time polymorphism
     ** By Using generics we can make a class that works with multiple data types*/
    public static void main(String[] args) {
        Student<String, Integer> student = new Student<String, Integer>("Dinesh",10);
        Student<String, String> student1 = new Student<String, String>("Dinesh","Maths");
        System.out.println(student);
        System.out.println(student1);
    }
}
