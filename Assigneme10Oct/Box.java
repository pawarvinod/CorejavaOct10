package JavaTraining10Oct;

public class Box 
{

	private int lenth;
	private int breath;
	private int height;
	private int mass;
	private int valume;
	
	public Box() 
	{
		this(0);
		System.out.println("defalt consterter");
	}
	public Box(int length)
	{
	
		this(0,0,0);
		System.out.println("defalt 1 arg consterter");
	}
	public Box(int lenth, int breath, int height) {
		super();
		this.lenth = lenth;
		this.breath = breath;
		this.height = height;
		System.out.println("defalt 3 arg consterter");
	}

	public int getLenth() {
		return lenth;
	}
	public void setLenth(int lenth) {
		this.lenth = lenth;
	}
	public int getBreath() {
		return breath;
	}
	public void setBreath(int breath) {
		this.breath = breath;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int calvoulme()
	{
		return height*breath*lenth;
	}
	
}
