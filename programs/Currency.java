import java.util.*;
public class Currency
{

    public static void main(String argc[])
	{
		int amount = 1100,temp;
		temp=amount;
		int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
            
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) 
	{
            
                System.out.println(notes[i] + " : "+ temp/notes[i]);
		temp=temp%notes[i];
            
        }
        
        }

}

