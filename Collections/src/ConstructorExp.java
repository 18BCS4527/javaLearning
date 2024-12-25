class Student1<T,U>{
	T id;
	U name;
	public Student1(T id, U name) {
		this.id = id;
		this.name = name;
		System.out.println(this.id+" "+this.name); 
	}
	
}
public class ConstructorExp {
	public static void main(String[] args) {
		// Constructor example with generics combination
		Student1<Integer,String> std =new Student1<Integer,String>(4527,"Dinesh");
		// Constructor will be called once we create the instance of the class 
		Student1<String,String> std1 =new Student1<String,String>("18BCS4527","Dinesh");
	}
}