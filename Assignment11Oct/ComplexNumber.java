package AssignmentClassAndObject;

 class ComplexNumber 
{
	
	public int[] addition(int r1, int r2, int i1,int i2)
	{
		int arr[]=new int[2];
		arr[0]=r1+r2;
		 arr[1]=i1+i2;
		return arr;
	}
	
	public static void main(String[] args) 
	{
		ComplexNumber obj= new ComplexNumber();
	    int[] add = obj.addition(10, 5,3,4);
		System.out.println();
		System.out.println(add[0]+" + "+add[1]+"i");
	}
}

