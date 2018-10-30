package PkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {
	int iLength = 5;
	int iWidth = 10;
	
	
	@Test
	void testPerimeter()	{
		Rectangle rect1 = new Rectangle(iWidth,iLength);
		double correctP = 30;
		if (rect1.perimeter() != correctP)	{
			fail("Correct perimeter not returned");
		}
	}
	
	@Test
	void testArea() {
		Rectangle rect1 = new Rectangle(iWidth,iLength);
		double correctA = 50;
		if (rect1.area() != correctA)	{
			fail("Correct area not returned");
		}
	}
	
	@Test
	void testGetiWidth() {
		Rectangle rect1 = new Rectangle(iWidth,iLength);
		double correctW = 10;
		if (rect1.getiWidth() != correctW)	{
			fail("Correct width not returned");
		}
	}

	@Test
	void testSetiWidth() {
		Rectangle rect1 = new Rectangle(iWidth,iLength);
		rect1.setiWidth(11);
		if (rect1.getiWidth() != 11)	{
			fail("Proper Width Not Set");
		}
	}

	@Test
	void testGetiLength() {
		Rectangle rect1 = new Rectangle(iWidth,iLength);
		double correctL = 5;
		if (rect1.getiLength() != correctL)	{
			fail("Correct length not returned");
		}
	}

	@Test
	void testSetiLength() {
		Rectangle rect1 = new Rectangle(iWidth,iLength);
		rect1.setiLength(6);
		if (rect1.getiLength() != 6)	{
			fail("Correct length not set");
		}
	}
	

	@Test
	void testRectangle() {
		Rectangle rect1 = new Rectangle(iWidth, iLength);
		Rectangle rect2 = new Rectangle(1,2);
		if (rect1 == rect2) {
			fail("Constructor does not create unique instances");
		}
	}
	
	@Test
	void testCompareTo()	{
		Rectangle rect1 = new Rectangle(2,2);
		Rectangle rect2 = new Rectangle(4,6);
		int val = rect1.area().compareTo(rect2.area());
		if (val < 0)	{
			fail("Rectangle.compareTo() does not sort in correct order");
		}
	}
}
