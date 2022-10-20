
// comparing the five numbers to find which is largest 
public class largestoffive {
public static void main (String[]args) {
	
	int a,b,c,d,e,largest;
	a=10;b=20;c=20;d=30;e=40;
	largest = (a>b&&a>c&&a>d&&a>e)?a:(a<b&&b>c&&b>d&&b>e)?b:(c>a&&c>b&&c>d&&c>e)?c:(d>a&&d>b&&d>c&&d>e)?d:e;

	System.out.println("The largest of 5 numbers is " +largest);
}
}
