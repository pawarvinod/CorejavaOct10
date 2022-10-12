package JavaTraining10Oct;

public class SumOFDigitOFnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
	
		int a=sumOfDigit(sum,0);	
		System.out.println(a);
	}

	private static int sumOfDigit(int sum, int i) {
		// TODO Auto-generated method stub
		if(i<10)
		{
			sum=sum+i;
		return	sumOfDigit(sum, ++i);
		}
		return sum;
		
	}
}
