package JavaTraining10Oct;

import java.util.Scanner;

public class CalculaterWithSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your 1stnNumber");
		int a=sc.nextInt();
		System.out.println("Enter your 2stnNumber");
		int b=sc.nextInt();
		System.out.println("declare symbol like this + , - , * , / ");
		int s=sc.next().charAt(0);
		int res=0;
		
		switch (s) 
		{
		case '+':
			res=a+b;

			System.out.println("your result is :"+a+"+"+b+"="+res);
			break;

		case '-':
			res =a-b;
			System.out.println("your result is :"+a+"-"+b+"="+res);
			break;
		case '*':
			res =a*b;
			System.out.println("your result is :"+a+"*"+b+"="+res);
			break;
			
		case '/':
			res =a/b;
			System.out.println("your result is :"+a+"/"+b+"="+res);
			break;
		case '%':
			res =a%b;
			System.out.println("your result is :"+a+"%"+b+"="+res);
			break;
		case 's':
			res =a*a;
			System.out.println("your result is :"+a+"*"+b+"="+res);
			break;
	}

	}

}
