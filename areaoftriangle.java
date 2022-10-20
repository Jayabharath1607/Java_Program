import java.util.Scanner;

public class areaoftriangle {
public static void main (String[]args)

{
   double length, breadth,area;
    
   System.out.println("Enter the lengthe and breadth of the Triangle: \t");
   Scanner input = new Scanner(System.in);
   length = input.nextDouble();
   breadth = input.nextDouble();
   
   area=(0.5)*length*breadth;
   System.out.println("The area of the triangle is "+area+ " whose length and breadth are " +length+" and " +breadth);
	
}
}

