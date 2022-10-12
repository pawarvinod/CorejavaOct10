package JavaTraining10Oct;

public class Shape
{
	public static void main(String[] args) {
	
		Shape1 []a= {new square(), new triangle(),new RectAngle()};
		for (Shape1 s : a)
		{
			s.dwow();
//			
//			System.out.println();
		}
	}
}
 class Shape1 
{
	void dwow()
	{
		System.out.println(" its from shape");
	}

}
class triangle extends Shape1
{
	void dwow()
	{
		System.out.println(" its from Triangle");
	}
}
class square extends Shape1
{
	void dwow()
	{
		System.out.println(" its from square");
	}
}
class RectAngle extends Shape1
{
	void dwow()
	{
		System.out.println(" its from rect angle");
	}
}

