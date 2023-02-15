public class CircleTester {

	public static void main(String[] args) {
	Circle c1 = new Circle(5);
	
	System.out.println(c1.toString());
	
	c1.setArea(55);
	System.out.println(c1.toString());
	
	c1.setCircumference(70.822);
	System.out.println(c1.toString());
	
	c1.setRadius(4.20);
	System.out.println(c1.toString());
	}
}
