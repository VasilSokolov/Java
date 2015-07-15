package live.example;

public class Rectangle extends MovableShape {

	private double width;
	private double height;

	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle (" + this.x + ", " + this.y + ", w= " + this.width + 
				", h= " + this.height + ")";
	}

}
