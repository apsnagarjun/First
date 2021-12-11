import java.util.Scanner;
class FindCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any caracter : ");
        char ch = scanner.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
		{

             System.out.println("It is A ALPHABET.");

        } 
		else if(ch >= '0' && ch <= '9') 
		{

             System.out.println("It is A DIGIT.");

        } 
		else 
		{

             System.out.println("It is A SPECIAL CHARACTER.");
        }
    
    }
}