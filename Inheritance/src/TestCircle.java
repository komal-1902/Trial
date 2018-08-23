import com.myabstract.Circle;
import com.myabstract.Rectangle;
import com.myabstract.Shape;

public class TestCircle {

	public static void main(String[] args) {
		
		Shape s = new Circle(2, "Circle");
		double a1 = s.area();
		System.out.println("Area of Circle: " + a1);
		s.description();
		
		Shape r = new Rectangle(2, 3, "Rectangle");
		double a2 = r.area();
		System.out.println("Area of Rectangle: " + a2);
		r.description();
		
	}

}
