
public class Triangle {

	private double side1;
	private double side2;
	
	private double side3;
	
	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}

	public static void initTriangle(Triangle t, double s1, double s2, double s3) {

		t.side1 = s1;
		t.side2 = s2;
		t.side3 = s3;

	}

	public double areaOfTriangle() {

		double s = (this.side1 + this.side2 + this.side3) / 2;
		double area = Math.sqrt(s * (s-this.side1) * (s-this.side2) * (s-this.side3));
		return area;

	}
	
	public boolean isEquilateral() {
		return ((this.side1 == this.side2) && (this.side2 == this.side3));
	}

}
