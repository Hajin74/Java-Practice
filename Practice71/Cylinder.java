/* 20200988 ��ǻ���а� ������
 * #71
 */
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius) {
		this(radius, 0);
	}
	
	public Cylinder() {
		this(0, 0);
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return getArea() * getHeight();
	}
}