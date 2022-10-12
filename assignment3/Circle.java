package shapes;
import java.lang.Math;

public class Circle implements Shape {
	private double radius;
	
	public Circle(double r) throws Exception {
		if(r > 0) {
			radius = r;
		}else {
			throw new Exception("Invalid radius!");
		}
	}

	public void setRadius(double r) throws Exception {
		if(r > 0) {
			radius = r;
		}else {
			throw new Exception("Invalid radius!");
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