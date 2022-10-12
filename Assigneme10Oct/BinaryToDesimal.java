package JavaTraining10Oct;

import java.util.Scanner;

public class BinaryToDesimal {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary Number");
		int num=sc.nextInt();
	Double desi=	BinaryToDecimal(num);
	System.out.println(desi);

	}

	private static double BinaryToDecimal(int num) 
	{
		double desimal=0;
		int i=0;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			desimal=desimal+rem*Math.pow(2,i);
			++i;
		}
		return desimal;
		
	}

}
