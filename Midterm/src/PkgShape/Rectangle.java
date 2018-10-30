package PkgShape;

public class Rectangle extends Shape {

	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength)	{
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public double area()	{
		return iWidth * iLength;
	}
	
	public double perimeter()	{
		return 2*(iWidth + iLength);
	}
	
	public int compareTo(Object obj)	{
		if ((double) obj > this.area())	{
			return 1;
		}
		if ((double) obj < this.area())	{
			return -1;
		}
		else	{
			return 0;
		}
	}
}