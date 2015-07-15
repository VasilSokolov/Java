package live.example;


public class Circle extends MovableShape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius < 0){
			throw new IllegalArgumentException("radius");
		}
		this.radius = radius;
	}

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}	
	@Override
	public String toString() {
		return "Circles (" + this.x + ", " + this.y + ", r= " + this.radius + ")";
	}
}
