package oop;

class Person {

    String name;;
    String email;
    String phone;

    void walk(){
	System.out.println(name + " is walking");
    }

    void eat(){
	System.out.println(name + " is eating");
    }

    void sleep() {
	System.out.println(name + " is sleeping");
    }
}
public class Demo {
    public static void main (String[] main) {
        // Instantiating an object
	Person person1 = new Person();

	// Define some properties
	person1.name = "Joe";
	person1.email = "joe@sample.com";
	person1.phone = "7787787878";

	// abstraction
	person1.walk();

	person1.sleep();

	Person person2 = new Person();
	person2.name = "Sarah";
	person2.sleep();
    }

}

// Person
//
//	// Attributes, variables, adjectives, description
//	String name = "Joe";
//	String email = "joe@sample.com";
//	String phone = "123456789";
//
//	// Action, activity, behavior
//	walking(name);
//	System.out.println(name + " is eating");
//
//	// What if we wanted to do this for another person
//	String name2 = "Sarah";
//	String email2 = "Sarah@sample.com";
//	String phone2 = "123456789";
//
//	// Action, activity, behavior
//	walking(name2);
//	System.out.println(name2 + " is eating");
//
//	// what about binding attributes and properties together

//    static void walking(String name) {
//	System.out.println(name + " is walking");
//    }