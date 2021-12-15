class PositiveNegativeArrayElement
{
	public static void main(String args[])
	{
		int arr[]={-4,-5,6,-9,86,-65,-2},j=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]<0)	
			{
				if(j!=i)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;	
			}
		}	
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
		
	}
}


