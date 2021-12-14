class LargestArrayElement
{
	public static void main (String args[])
	{
		int a[]={1,2,5,6,3,2}; 
		for (int i = 0; i < a.length; i++)   
        {  
            for (int j = i + 1; j < a.length; j++)   
            {  
                if (a[i] < a[j])   
                {  int temp;
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            } 
			if (i<2)
			System.out.println(" "+a[i]);
        }  
		
	}
}