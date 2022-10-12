package shapes;

public class Rectangle extends Parallelogram {
	
	public Rectangle(double width, double height) throws Exception {
		super(width, height);
	}

	public double getPerimeter() {
		return 2 * (getWidth() + getHeight());
	}

	public String toString() {
		return String.format("%s {w=%.1f, h=%.1f} perimeter = %.4f", this.getClass().getSimpleName(), getWidth(), getHeight(), getPerimeter());
	}
}