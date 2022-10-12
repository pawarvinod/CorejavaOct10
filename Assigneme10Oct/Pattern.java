package JavaTraining10Oct;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
	    
	    Scanner sc = new Scanner(System.in);
	   
	    System.out.print("Enter the Numbers = ");
	    int num = sc.nextInt();
	    
	    for(i=1;i<=num;i++)
	    {
	        
	        for(j=i;j<=num;j++)
	            System.out.print(" ");
	        
	        for(j=1;j<=i;j++)
	            System.out.print(j+"");
	        
	        for(j=i-1;j>=1;j--)
	            System.out.print(j+"");
	        System.out.println();
	     }
				
	}

}
