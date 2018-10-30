package PkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle	{
	
	private int iDepth;
	
	public Cuboid(int iLength, int iWidth, int iDepth)	{
		super(iWidth, iLength);
		this.iDepth = iDepth;
	}
	
	public void setiDepth(int iDepth)	{
		this.iDepth = iDepth;
	}
	
	public int getiDepth()	{
		return iDepth;
	}
	
	public double volume()	{
		return super.area()*iDepth;
	}
	
	@Override
	public double area()	{
		return 2*(super.area() + this.iDepth*super.getiWidth() + this.iDepth*super.getiLength());
	}
	
	@Override
	public double perimeter()	{
		throw new UnsupportedOperationException("3-D perimeter DNE");
	}
	
	public int compareTo(Object obj) 	{
		Cuboid cub = (Cuboid) obj;
		if (cub.area() > this.area())	{
			return 1;
		}
		if (cub.area() < this.area())	{
			return -1;
		}
		else	{
			return 0;
		}
	}
	
		class SortByArea implements Comparator<Cuboid>	{
	
		public int compare(Cuboid Cuboid1, Cuboid Cuboid2 )	{
			return Cuboid1.area().compareTo((Object)Cuboid2.area());
		}
	}
	
	class SortByVolume implements Comparator<Cuboid>	{ //public access modifier nested class
		
		public int compare(Cuboid Cuboid1, Cuboid Cuboid2)	{
			return Cuboid1.volume().compareTo(Cuboid2.volume());
		}	
	}
}
