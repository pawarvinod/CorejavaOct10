package JavaTraining10Oct;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=100;
		int count=0;
		int i=2;
		loopI(num,i,count);
	}

	private static void loopI(int num, int i, int count)
	{
		if(i<num)
		{
			
			int j=1;
		int cnt=	loopj(i,j,count);
		if(cnt==2)
		{
			System.out.print(i+" ");
			count=0;
		}
			loopI(num, ++i, count);
		}
		
	}

	private static int loopj(int i, int j, int count) 
	{
		if(j<=i)
		{
			if(i%j==0)
			{
				count++;
			}
		return	loopj(i, ++j, count);
		}
		return count;
		
	}

}
