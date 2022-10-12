package JavaTraining10Oct;

import java.util.Scanner;

public class StringToBinaryConverstion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String binary;
		int count = 0;
		System.out.print( "Enter your binary number: ");
		binary = scan.nextLine( );

		for ( int i = 0; i <= binary.length()-1; i++){
		    char c = binary.charAt(i);

		    while ((c != '1') || (c != '0'))
		    {
		        System.out.println( "Invalid Number try again" );
		        System.out.println("Enter your binary number: ");
		        binary = scan.nextLine();
		    }
		    if ( c == '1')
		        count++;
		}
		System.out.println("The number of 1s are: "+count);     

	}

}
