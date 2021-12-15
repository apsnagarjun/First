import java.util.Scanner;
class Absolute
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numebr");
		int a=sc.nextInt();
		int b=Math.abs(a);
		System.out.println("the absolute of "+a+" is "+b);
		
		
	}
	
}