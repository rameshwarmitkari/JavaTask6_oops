package Task_6;
// Create class called person with attribute "name" and "age", also create constructor and getter method for attribute

public class Person {

	String name;
	int age;

	Person(String name, int age){ //parameterized constructor
		this.name = name;  //this keyword refers to the current class instance.
		this.age = age;
	}

	public String getname() { // getter method to get values
		return name;
	}
	public int getage() { // getter method to get values
		return age;
	}
	public static void main(String[] args) {

		Person p = new Person("Guvi", 12);
		System.out.println("Name is ->" +p.getname() );
		System.out.println( "Age is-> "+p.getage());

	}
}
