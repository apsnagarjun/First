import java.util.*;
class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet:  ");
		char s =sc.next().charAt(0);
		//char s='o';
		if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='O'||s=='O'||s=='U')
		{
			System.out.println("It is a vowel");
			
		}
		else
		{
			System.out.println("It is a Consonant");
		}
	}
		
}