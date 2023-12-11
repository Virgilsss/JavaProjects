/**
 * 
 * 
 * @author (Charles Vitkus) 
 * @version (11-13-2023)
 */
import java.util.Scanner;
public class nameSwitch

{
  public static void main (String [] args)
  {
      Scanner console = new Scanner(System.in);
      String input;
      
      System.out.println("prompt use the word cat or dog in a sentence. ");
      input = console.nextLine();//user input gets stored in input
      while(input.indexOf("cat") >= 0)
      {
          String text1 = input.substring(0,input.indexOf("cat"));
          String text2 = input.substring(input.indexOf("cat") + 3);
          input = text1 + "dog" + text2;
          
      }
      System.out.println(input);
      
  }
}
