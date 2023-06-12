package logic;

public class Rectangle implements Polygon {

	private double height;
	private double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double calculateSurfaceArea() {
		double surfaceArea = height * width;
		return surfaceArea;
	}

	@Override
	public double calculateScope() {
		double scope = width * 2 + height * 2;
		return scope;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
