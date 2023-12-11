/**
 * Converts Temperture from farenheit to celsius .
 * 
 * @author (your name) 
 * @version (9/12/2023)
 */
import java.util.Scanner;
public class TempConverter
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int fahrenheit;
        System.out.print("Enter a Farenheit temperature: ");
        
        fahrenheit = console.nextInt();
        
        double celsius = (fahrenheit - 32)*(5/9.0);
        
        System.out.println("Fahrenheit temperature = " + fahrenheit);
        System.out.println("Celsius temperature = " + celsius);
        System.out.print(fahrenheit + " degrees F equals " + (int)(celsius+.5) + " degrees C");
        
    }
}
