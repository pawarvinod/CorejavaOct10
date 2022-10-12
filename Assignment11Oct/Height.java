package AssignmentClassAndObject;

import java.util.Scanner;

public class Height 
{

	int feet;
	int inces;
	
//	public Height(int feet) {
//		super();
//		this.feet = feet;
////		this.inces = inces;
//	}

	public void convertInInches(int a, int b)
	{
		//1 foot = 12 inches distance in inches = (distance in feet) x (12 inches/foot)
		 
		int sum=a+b;
		inces=sum*12;
		System.out.println(inces);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your feet 1");
		int f1=sc.nextInt();
		System.out.println("Enter your feet 2");
		int f2=sc.nextInt();
		Height h = new Height();
		h.convertInInches(f2,f1);  
	}
}
