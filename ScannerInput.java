import java.util.Scanner;

public class ScannerInput{

public static void main (String[]args) {
int age;
float fee;
String name;
char gender;

Scanner input = new Scanner(System.in);   //user input
System.out.println("Enter your name: ");
name= input.nextLine();

System.out.println("Enter your age: ");
age = input.nextInt();

System.out.println("Enter the fee: ");
fee = input.nextFloat();

System.out.println("Enter the Gender: ");
gender= input.next().charAt(0);

// Displaying the outputs

System.out.println("Your name is " +name);
System.out.println("Your age is " +age);
System.out.println("Your fee is " +fee);
System.out.println("Your gender is " +gender);


}
	}