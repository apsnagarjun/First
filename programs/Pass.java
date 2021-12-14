import java.util.*;
class Pass
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks for three paper: ");
		int marks=sc.nextInt();
		int marks2=sc.nextInt();
		int marks3=sc.nextInt();
		
		if(marks>45&&marks2>45&&marks3>45)
		{
			System.out.println("You have passed the exam");
		}
		else
		{
			System.out.println("You have failed the exam");
		}
		
	}
}