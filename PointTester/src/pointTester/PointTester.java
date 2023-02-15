package pointTester;
import java.util.*;
public class PointTester {

	public static void main(String[] args) {
		Point p1 = new Point(10,5);
		Point p2 = new Point(20,5);
		Point p3 = new Point(15,5);
		System.out.println(isOnLine(p1,p2,p3));
		//p1.setY(20.2);
		System.out.println(p1.getX()+","+p1.getY());
		System.out.println(p2);
		System.out.println(p1.equals(p2));

	}

public static boolean isOnLine(Point p1, Point p2, Point p3) {
	double x1=p1.getX();
	double y1=p1.getY();
	double x2=p2.getX();
	double y2=p2.getY();
	double x3=p3.getX();
	double y3=p3.getY();
	
	double slope=(y2-y1)/(x2-x1);
	System.out.println(slope);
	double b=y1-slope*x1;
	System.out.println(b);
	return y3==slope*x3+b;
}
}
