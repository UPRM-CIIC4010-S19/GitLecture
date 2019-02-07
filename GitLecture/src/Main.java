class Main {
	
	public static void main(String[] args) {
		
		Triangle t1 = new Triangle(10.0, 10.0, 10.0);
		System.out.println("The area of the first triangle is " + t1.areaOfTriangle());

		Triangle t2 = new Triangle(20.0, 20.0, 20.0);
		System.out.println("The area of the second triangle is " + t2.areaOfTriangle());

		Triangle t3 = new Triangle(30.0, 40.0, 50.0);
		System.out.println("The area of the third triangle is " + t3.areaOfTriangle());
						
	}


}