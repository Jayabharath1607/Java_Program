
public class swapnumberwithoutvariable {

	public static void main(String[] args) {
		double a,b;
		a=107;
		b=100;
		System.out.println("Before interchanging a="+a+" and b="+b);
		a=a+b; //a=20+40=60
		b=a-b;  //b=a-b;  //60-40=20
		a=a-b;  //a=a-b;  60-20=40
		
		System.out.println("After interchanging a="+a+" and b="+b);
	}
}
