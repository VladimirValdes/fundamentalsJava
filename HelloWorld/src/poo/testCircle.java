package poo;

public class testCircle {

	public static void main(String[] args) {
		/*Circle circle1 = new Circle();
		System.out.println("/n Radius of Circle: "+ circle1.getRadius());
		System.out.println("/n Area of Circle: "+ circle1.getArea());
		
		Circle circle2 = new Circle(2.0);
		System.out.println("/n Radius of Circle2: "+ circle2.getRadius());
		System.out.println("/n Area of Circle2: "+ circle2.getArea());*/
		
		
		Circle circle3 = new Circle(5.5, "blue");
		/*circle3.setColor("blue");
		circle3.setRadius(5.5);*/
		System.out.println("/n Radius of Circle3: "+ circle3.getRadius());
		System.out.println("/n Area of Circle3: "+ circle3.getArea());
		System.out.println("/n Color of Circle3: "+ circle3.getColor());

	}

}
