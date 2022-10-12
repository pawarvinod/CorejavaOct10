package JavaTraining10Oct;

public class FirstClass {

	
	public static int max(int a, int b)
	{
		return a>b  ?a:b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int c=30;
		int d=23;
		
		if(a>b && b>c && c>d)
		{
			System.out.println();
		}
//		
//		if(a>b)
//		{
//			if(a>c)
//			{
//				System.out.println("a is grater ");
//			}
//			else
//			{
//				System.out.println("b is greater");
//			}
//		}
//		else
//		{
//			if(b>c)
//			{
//				System.out.println("b is grater ");
//			}
//			else
//			{
//				System.out.println("c is greater");
//			}
//		}
//
//		System.out.println(FirstClass.max(a, b));
//		
//	}
	
		System.out.println(FirstClass.max(a,FirstClass.max(b,FirstClass.max(c, d))));
	}
}
