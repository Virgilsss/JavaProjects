/**
 * This is a magic 8 ball clas that ask users for a question, than it generates a random number between 1 and 8 and prints out a 
prompt based on the random number generated.
 * 
 * @author (Charles Vitkus) 
 * @version (10-12-2023)
 */
import java.util.Scanner;
public class Magic8Ball
{
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        int num =(int)(Math.random()*8)+1;
        String input;
        System.out.println("What is your question? ");
        input = console.nextLine();
        if(num == 1)
        {
            System.out.print("Not gonna happen");
        }
        if(num == 2)
        {
            System.out.print("Yes most definitely");
        }
        if(num == 3)
        {
            System.out.print("Be patient");
        }
        if(num == 4)
        {
            System.out.print("I think so, its hard to tell");
        }
        if(num == 5)
        {
            System.out.print("No");
        }
        if(num == 6)
        {
            System.out.print("One day");
        }
        if(num == 7)
        {
            System.out.print("I don't understand?");
        }
        if(num == 8)
        {
            System.out.print("Tomorrow");
        }
    }
    
}
