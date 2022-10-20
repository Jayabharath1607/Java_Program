 import java.util.Scanner;

public class sqarea {

	public static void main(String[] args)
	{
	double side,area;
		System.out.println("Enter the side of the Square :");
    Scanner input= new Scanner(System.in);
    side= input.nextDouble();
    
    area= side*side;
    System.out.println("The area of the Square having side "+side+ " is "+area);
    
	
	}
}
