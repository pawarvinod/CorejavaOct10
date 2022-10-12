package JavaTraining10Oct;

public class BoxWaigth extends Box 
{

	private int waigth;

	public BoxWaigth()
	{
		
	}
	public BoxWaigth(int waigth, int length,int height, int breath) 
	{
		super(length,height,breath);
		this.waigth = waigth;
	}
	public int getWaigth() 
	{
		return waigth;
	}
	public void setWaigth(int waigth)
	{
		this.waigth = waigth;
	}
	public int calsdencity()
	{
		return this.waigth;///this.length;
		
	}
}
