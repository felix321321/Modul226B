package logic;

public class Hexagon implements Polygon {

	private double sidelenght;

	public Hexagon(double value1) {
		sidelenght = value1;
	}

	@Override
	public double calculateSurfaceArea() {
		return 1.5 * Math.pow(sidelenght, 2) * 1.73205080757;
	}

	@Override
	public double calculateScope() {
		return sidelenght * 6;
	}

	public double getSidelenght() {
		return sidelenght;
	}

	public void setSidelenght(double sidelenght) {
		this.sidelenght = sidelenght;
	}

}
