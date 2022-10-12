package JavaTraining10Oct;

public class PrimeNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		int num=8;
	int a=	primeNumber(2,cnt,num);
	if(a==0)
	{
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Not Prime");
	}

	}

	private static int primeNumber(int i, int cnt, int num) {
		// TODO Auto-generated method stub
		if(i<num)
		{
			if(num%i==0)
			{
				cnt++;
			}
		return	primeNumber(++i, cnt, num);
		}
		return cnt;
		
	}

}
