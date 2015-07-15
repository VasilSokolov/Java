package live.example;

public class PlayWithShapes {

	public static void main(String[] args) {
		Movable shape = new Circle(100, 200, 25);
		shape.move(5, 12);
		System.out.println(shape);

		Movable rect = new Rectangle(5, 10, 200, 300);
		
		System.out.println(rect);
	}
}
