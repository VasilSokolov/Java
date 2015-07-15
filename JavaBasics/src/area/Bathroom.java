package area;

public class Bathroom implements AreaCalculatable {
	private double width;
	private double height;
	private double depth;
	
	
	public Bathroom(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
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



	public double getDepth() {
		return depth;
	}



	public void setDepth(double depth) {
		this.depth = depth;
	}



	@Override
	public double calcSurface() {
		return 
				this.width * this.height * 2+
				this.width * this.depth * 2+
				this.depth * this.height * 2;
	}
}
