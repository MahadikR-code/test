// A Simple Generics class
// Here,T is a type parameter that will be replaced by a real type when an object of type Gen is created
//Declare a generic class. T is the generic type parameter
class Gen<T> {
	T ob; // declare an object of type T
//Pass the contructor a reference to an object of type T

	Gen(T o) {
		ob = o;
	}

	// return ob
	T getob() {
		return ob;
	}

	// show type of T
	void show() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}

}

//Demonstrate the generic class
public class Demo_01 {

	public static void main(String[] args) {
		Gen<Integer> iob; // Creating Gen references for Integers
		iob = new Gen<Integer>(88);
		iob.show();
		int v = iob.getob();
		System.out.println("Value " + v);
		System.out.println();

		Gen<String> obj = new Gen<String>("Generics test");
		obj.show();

		String str = obj.getob();
		System.out.println("Value " + str);

	}

}
