/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

class Circle {
	private int xPos, yPos, radius;

	public Circle() {
		xPos = 20;
		yPos = 20;
		radius = 10;
	}

	public String toString() {
		return "center = (" + xPos + "," + yPos + ") and radius = " + radius;

	}

	public static void main(String[] s) {
		System.out.println(new Circle());
	}
}