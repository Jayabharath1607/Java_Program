import java.util.Scanner;

public class areaofcircle {

	public static void main(String[]args) {
		
		double  radius, area;
     	System.out.println("Enter the radius of the circle: \t");
	
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		
		double a=22,b=7,pi =a/b;
		area = pi*radius*radius;
		
		System.out.println("Area of the Circle is " +area+ " whose radius is " +radius);
  		
	}
}
