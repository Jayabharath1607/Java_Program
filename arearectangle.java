import java.util.Scanner;
public class arearectangle {

	public static void main (String[] args)
	{
		double length,breadth, area;
		System.out.println("Enter the Length and Breadth of the rectangle:\n ");
		
		Scanner input= new Scanner (System.in);
		length = input.nextDouble();
		breadth = input.nextDouble();
		
		area = length*breadth;
		
		System.out.println("The area of reactangle whose length and breadth are "+length+ " and "+breadth+ " is " +area);		
	}
	
}








