package Task_6;

public class Circle {

	int radius;

	Circle(){
		System.out.println("no argument constructor called");
	}

	Circle(int radius){
		this.radius = radius;
	}
	public void circumference() {
		System.out.println(2*Math.PI*radius); //print circumference of circle
	}


	public static void main(String[] args) {

		Circle obj = new Circle( );
		Circle obj1 = new Circle( 5);
		obj1.circumference();

	}

}
