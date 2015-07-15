package area;

public class Circle extends MovableShape implements AreaCalculatable {
		private double radius;
		
		public double getRadius(){
			return radius;
	}

		@Override
		public double calcSurface() {
			return this.radius * this.radius*Math.PI;
		}

}
