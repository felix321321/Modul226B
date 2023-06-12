package logic;

public class Oktagon implements Polygon {

	private double sidelenght;

	public Oktagon(double sidelenght) {
		this.sidelenght = sidelenght;
	}

	@Override
	public double calculateSurfaceArea() {
		double surfaceArea = 2 * Math.pow(sidelenght, 2) * (1 + Math.pow(sidelenght, 1 / 2));
		return surfaceArea;
	}

	@Override
	public double calculateScope() {
		double scope = 8 * sidelenght;
		return scope;
	}

	public double getSidelenght() {
		return sidelenght;
	}

	public void setSidelenght(double sidelenght) {
		this.sidelenght = sidelenght;
	}

}
