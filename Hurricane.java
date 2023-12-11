/**
 * Determines the category of a hurricane based of Wind speed and storm surge.
 * 
 * @author (Charles Vitkus) 
 * @version (10-26-2023)
 */
import java.util.Scanner;
public class Hurricane
{
    public static void main(String [] args)

    {
        Scanner console = new Scanner(System.in);
        int windSpeed, category, stormSurge; 
        String damage, H; H = "Hurricane";//declare the word hurricane as the variable h and delcare the string damage
        System.out.println("what is the wind speed in mph? ");
        windSpeed = console.nextInt();
        System.out.print(" what is the storm surge in feet? ");
        stormSurge = console.nextInt();
        
        if( (74 <= windSpeed || windSpeed>= 95 && windSpeed < 96) && stormSurge == 4 || stormSurge == 5) 
        //if wind is greater then 74 or less then 95 but also less then 96 and storm surge is 4 or 5 its a category 1
        
       {
           damage = "Minimal"; category = 1;
           System.out.print ( damage + " damage, category "+ category + " " + H);
       }
       if( (96 <= windSpeed || windSpeed>= 110 && windSpeed < 111) && stormSurge >= 6 && stormSurge <= 8)
       //if wind is greater then 74 or less then 95 but also less then 96 and storm surge is greater than 6 and less than or equal to 8 its a category 2
       {
           damage = "Moderate"; category = 2;
           System.out.print ( damage +" damage, category "+ category + " " + H);
       }
       if( (111 <= windSpeed || windSpeed>= 130 && windSpeed < 131) && stormSurge >= 9 && stormSurge <= 12)
       {
           damage = "Extensive"; category = 3;
           System.out.print ( damage +" damage, category "+ category + " " + H);
       }
       if( (131 <= windSpeed || windSpeed>= 155 && windSpeed < 156) && stormSurge >= 13 && stormSurge <= 18)
       {
           damage = "Extreme"; category = 4;
           System.out.print ( damage +" damage, category "+ category + " " + H);
       }
       if( 155 < windSpeed && stormSurge > 18)
       {
           damage = "Catastrophic"; category = 5;
           System.out.print ( damage +" damage, category "+ category+ " " + H);
       }
       
    }
   
   
}
