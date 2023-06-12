package logic;

public class Circle implements Polygon {

	public static final double pi = 3.14;
	private double width;

	public Circle(double radius) {
		this.width = radius * 2;
	}

	@Override
	public double calculateSurfaceArea() {
		double surfaceArea = width / 2 * width / 2 * pi;
		return surfaceArea;
	}

	@Override
	public double calculateScope() {
		double scope = pi * width;
		return scope;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
