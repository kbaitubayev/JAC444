package shapes;

public class Square extends Rectangle {
	
	public Square(double side) throws Exception {
		super(side, side);
	}
	
	@Override
	public void setWidth(double width) throws Exception {
		if(width > 0) {
			super.setWidth(width);
			super.setHeight(width);
		}
		else {
			throw new Exception("Invalid sides!");
		}
	}

	public void setHeight(double height) throws Exception {
		if(height > 0) {
			super.setWidth(height);
			super.setHeight(height);
		}
		else {
			throw new Exception("Invalid sides!");
		}
	}

	public double getPerimeter() {
		return 4 * getWidth();
	}

	public String toString() {
		return String.format("%s {s=%.1f} perimeter = %.3f", this.getClass().getSimpleName(), super.getHeight(), getPerimeter());
		
	}
}