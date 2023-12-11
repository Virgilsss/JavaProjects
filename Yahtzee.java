/**
 * creates 5 dice, each dice is set to a random number between 1 and 5 and every time all of the dice equal eachother the count goes up by 1.
 * 
 * @author (Charles Vitkus) 
 * @version (11-16-2023)
 */
public class Yahtzee
{
   public static void main(String [] args)
   {
    int i, dice1, dice2, dice3, dice4, dice5, count; //declaring all the dice variable
    
   i = 0; 
   count = 0;//set count at 0
   while( i <= 100000 ){
       i++;//1 goes up by 1 until it = 100,000
    dice1 = (int)(Math.random() * 6) + 1;
    dice2 = (int)(Math.random() * 6) + 1;
    dice3 = (int)(Math.random() * 6) + 1;//making the dice a random number between 1 and 6
    dice4 = (int)(Math.random() * 6) + 1;
    dice5 = (int)(Math.random() * 6) + 1;
       if(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)//if all dice equal eachother than count goes up by 1
       {
           count++;
       }
    }
    System.out.println(count);//prints how many times all 5 dice were equal
    System.out.print(count/100000.0);//gets the percentage of times all dice were equal
}
}
