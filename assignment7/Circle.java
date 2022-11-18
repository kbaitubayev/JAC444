package shapes;
import static java.lang.Math.PI;
import java.lang.Math;

public class Circle implements Shape {
	private double radius;
	/*
	 *  Lambda expression
	 */
	private ShapeArea shape = () -> PI * getRadius() * getRadius();
	
	public double calculateArea() {
		return shape.getArea();
	}	
	
	public Circle(double r) throws CircleException {
		if(r > 0) {
			radius = r;
		}else {
			throw new CircleException("Invalid radius!");
		}
	}

	public void setRadius(double r) throws CircleException {
		if(r > 0) {
			radius = r;
		}else {
			throw new CircleException("Invalid radius!");
		}
	}

	public double getRadius() {
		return radius;
	}

	public double getPerimeter() {
		return (getRadius() * 2) * Math.PI;
	}
	
	public String toString() {
		return String.format("%s {r=%.1f} perimeter = %.4f", this.getClass().getSimpleName(), getRadius(), getPerimeter());
	}
}