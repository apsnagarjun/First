import java.util.*;
class PassWithGender
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks for three paper: ");
		int marks=sc.nextInt();
		int marks2=sc.nextInt();
		int marks3=sc.nextInt();
		double total;
		double percentage;
		total= marks+marks2+marks3;
		percentage=(total/300)*100;
		
		System.out.println("enter your gender");
		char ch=sc.next().charAt(0);
		
		if(percentage>60&&ch=='f'||percentage>60&&ch=='F')
		{
			System.out.println("You can take the admission");
		}
		else
		{
			System.out.println("You can't take the admission");
		}
		
	}
}