package JavaTraining10Oct;

public class Recurtionn
{

	public static void main(String[] args) {
	
		print(0);
	
	}

	private static void print(int i) {
		if(i<10)
		{
			System.out.println(i);
			print(++i);
		}
		
	}
}
