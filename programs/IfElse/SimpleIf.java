import java.util.*;
class SimpleIf 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		("Enter an integer: ");
		int number=sc.nextInt();
		
		if (number < 0) 
		{
			System.out.println("You entered negative.");
		}

		System.out.println("Outside if block.");
	}

  
}