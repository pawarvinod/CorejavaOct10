package JavaTraining10Oct;

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		b o= new b();
		System.out.println(o.i);
		o.m1();
	}
}
	class a
	{
		int i=10;
		void m1()
		{
			System.out.println("this is from a class");
		}
		
	}
	class b extends a
	{
		int i=20;
		void m1()
		{
			System.out.println("this is from b class");
		}
		
	}
