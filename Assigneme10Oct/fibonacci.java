package JavaTraining10Oct;

public class fibonacci {

	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		System.out.println(a);
		fibonacciSeries(a,b,0);
		
	}

	private static void fibonacciSeries(int a, int b, int i) 
	{
		if(i<10)
		{
			int c=a+b;
			a=b;
			b=c;
//			System.out.println(c);
			int j=2;
			looj(c,0);
			fibonacciSeries(a, b, ++i);
		}
		
	}

	private static void looj(int c, int j)
	{
		if(j<=c)
		{
			int k=1;
		int p=loopk(c,k,j);
		if(p==2)
		{
			System.out.print(j+" ");
		}
			looj(c, ++j);
		}
		
	}

	private static int loopk(int c, int k, int j) 
	{
		count=0;
		if(k<=j)
		{
			if(j%k==0)
			{
				count++;
			}
		return	loopk(c, ++k, j);
		}
		return count;
		
	}

}
