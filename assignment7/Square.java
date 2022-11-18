package shapes;

public class Square extends Rectangle {
	
private ShapeArea shape = () -> getWidth() * getHeight();
	
	public double squareValue(double width, ShapeArea sfi) {
		return sfi.getArea();
	}
	@Override
	public double calculateArea() {
		return squareValue(getWidth(), shape);
	}
	
	public double caculateArea() {
		
		return shape.getArea();
	}	
	
	public Square(double side) throws Exception {
		super(side, side);
	}
	
	public void setWidth(double width) throws ParallelogramException {
		if(width > 0) {
			super.setWidth(width);
			super.setHeight(width);
		}
		else {
			throw new ParallelogramException("Invalid sides!");
		}
	}

	public void setHeight(double height) throws ParallelogramException {
		if(height > 0) {
			super.setWidth(height);
			super.setHeight(height);
		}
		else {
			throw new ParallelogramException("Invalid sides!");
		}
	}

	public double getPerimeter() {
		return 4 * getWidth();
	}

	public String toString() {
		return String.format("%s {s=%.1f} perimeter = %.3f", this.getClass().getSimpleName(), super.getHeight(), getPerimeter());
		
	}
}