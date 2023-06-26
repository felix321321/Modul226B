import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import logic.Circle;
import logic.Oktagon;
import logic.Rectangle;

class CalculationTest {

	@Test
	void test1() {
		Rectangle rectangle = new Rectangle(2, 3);
		assertEquals(rectangle.calculateScope(), 10);
	}

	@Test
	void test2() {
		Rectangle rectangle = new Rectangle(2, 3);
		assertEquals(rectangle.calculateSurfaceArea(), 6);
	}

	@Test
	void test3() {
		Circle circle = new Circle(3);
		assertEquals(circle.calculateScope(), 18.84);
	}

	@Test
	void test4() {
		Circle circle = new Circle(3);
		assertEquals(circle.calculateSurfaceArea(), 28.26);
	}

	@Test
	void test5() {
		Oktagon oktagon = new Oktagon(3);
		assertEquals(oktagon.calculateScope(), 24);
	}

	@Test
	void test6() {
		Oktagon oktagon = new Oktagon(3);
		assertEquals(oktagon.calculateSurfaceArea(), 36);
	}

}
