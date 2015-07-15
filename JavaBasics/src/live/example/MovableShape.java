package live.example;

public abstract class MovableShape implements Movable {
	protected double x;
	protected double y;
	
	@Override
	public void move(double deltaX, double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}

	public MovableShape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
}
