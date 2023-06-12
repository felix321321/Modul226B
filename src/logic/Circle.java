package logic;

public class Circle implements Polygon {

	public static final double pi = 3.14;
	private double width;

	public Circle(double width) {
		this.width = width;
	}

	@Override
	public double calculateSurfaceArea() {
		double surfaceArea = width * pi;
		return surfaceArea;
	}

	@Override
	public double calculateScope() {
		double scope = pi * 2 * (width / 2);
		return scope;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
