import java.util.*;
class SearchArrayElement
{
	public static void main (String args[])
	{
		int a[]={1,2,5,6,3,2}; 
		System.out.print("Enter the element you want to find:");
		Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
		int flag=0,i;
		for(i = 0; i < a.length; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
		else
		{
			System.out.println("Element not found"); 
		}
	}
}
		