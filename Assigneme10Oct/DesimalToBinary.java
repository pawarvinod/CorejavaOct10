package JavaTraining10Oct;

import java.util.Scanner;

public class DesimalToBinary {

	static int index=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number which u want: ");
		int num = sc.nextInt();
//		System.out.println("Binary number is " + Integer.toString(num, 2));
		int a[]=new int[10];

		desimalToBinry(a,0,num);
		
		
		}

	private static void desimalToBinry(int[] a, int i,int num) {
		while(num>0)
		{
			int res=num%2;
			a[index++]=res;
			num=num/2;
		}
		for (int k = index-1; k>=0; k--) 
		{
			System.out.print(a[k]);
		}
	}
}
