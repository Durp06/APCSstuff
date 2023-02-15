public class Circle {
	private double radius;
	private double circumference;
	private double pi = (Math.PI);
	private double area;
	
	
	
	public Circle (double radius) {
		this.radius=radius;
		circumference = 2 * pi * radius;
		area = pi * (radius * radius);
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
		circumference = 2 * pi * radius;
		area = pi * (radius * radius);
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area=area;
		
		radius=Math.sqrt(area/pi);
		circumference = 2 * pi * radius;
	}
	 
	public double getCircumference() {
		return circumference;
	}
	
	public void setCircumference(double circumference) {
		this.circumference=circumference;
		
		area = pi * (radius * radius);
		radius = (circumference/pi)/2;
	}
	
	public String toString() {
		return "Radius: " + radius + "Area: " + area + "Circumference: "+ circumference;
	}
	
}


