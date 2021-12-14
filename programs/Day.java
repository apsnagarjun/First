import java.util.*;
class Day
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day:  ");
		String s=sc.nextLine();
		
		if(s.equals("Monday")||s.equals("Tuesday")||s.equals("Wednesday")||s.equals("Thursday")||s.equals("monday")||s.equals("tuesday")||s.equals("wednesday")||s.equals("thursday"))
		{
			System.out.println("the day you entered is working day. ");
		}
		else
		{
			System.out.println("the day you entered is weekend day. ");
		}
	}
}