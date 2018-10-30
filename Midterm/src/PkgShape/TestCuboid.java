package PkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCuboid {

	@Test
	void testCuboid() {
		Cuboid cub1 = new Cuboid(1,2,3);
		Cuboid cub2 = new Cuboid(3,2,1);
		if (cub2 == cub1)	{
			fail("Constructor does not create unique instances");
		}
	}

	@Test
	void testSetiDepth() {
		Cuboid cub1 = new Cuboid(1,2,3);
		cub1.setiDepth(6);
		if (cub1.getiDepth() != 6)	{
			fail("Correct depth not set");
		}
	}


	@Test
	void testGetiDepth() {
		Cuboid cub1 = new Cuboid(1,2,3);
		double correctD = 3;
		if (cub1.getiDepth() != correctD)	{
			fail("Correct depth not returned");
		}
	}
	
	@Test
	void testArea()	{
		Cuboid cub1 = new Cuboid(2,3,4);
		double correctA = 52;
		if (cub1.area() != correctA) {
			fail("correct surface area not calculated");
		}
	}
	
	@Test
	void testPerimeter()	{
		Cuboid cub1 = new Cuboid(2,3,4);
		boolean thrown = false;
		
		try	{
			cub1.perimeter();
		} catch (UnsupportedOperationException e)	{
			thrown = true;
				}
		assertTrue(thrown);
	}
			

	@Test 
	void testSortByArea()	{
		Cuboid cub1 = new Cuboid(5,4,6);
		Cuboid cub2 = new Cuboid(6,8,9);
		double correctVal = -1;
		if (Cuboid.SortByArea.compare(cub1,cub2) != correctVal)	{
			fail("Area's not correctly compared");
		}
	}
	
	@Test 
	void testSortByVolume()	{
		Cuboid cub1 = new Cuboid(5,4,6);
		Cuboid cub2 = new Cuboid(6,8,9);
		double correctVal = -1;
		if (Cuboid.SortByVolume.compare(cub1,cub2) != correctVal)	{
			fail("Volume's not correctly compared");
	}
}

}
