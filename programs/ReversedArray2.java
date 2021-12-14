class ReversedArray2
{
	public static void main (String args[])
	{
		int array[]={1,2,3,5,6},temp=0;
		System.out.println("array in reverse order");
		int j=array.length-1;
		for (int i=0;i<array.length/2;i++)
		{
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			j--;

		
		}
		for (int i=0;i<array.length;i++)
		{
			System.out.print(" "+array[i]);
		}
	}
	
}