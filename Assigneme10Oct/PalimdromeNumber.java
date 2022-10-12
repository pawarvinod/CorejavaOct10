package JavaTraining10Oct;

import java.util.Scanner;

public class PalimdromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your palimdorme numer");
		int a=sc.nextInt();
		int num=a;
		int sum=0;
		int r=0;
		while(num>0)
		{
			 r=num%10;
			    sum=(sum*10)+r;
			    num/=10;	
		}
		if(a==sum)
		{
			System.out.println("palimdrome");
		}
		else
		{
			System.out.println("nopt palimdrome");
		}

	}

}
