/**
 * NumSorter sorts numbers by returning the smallest number first and the biggest number last .
 * 
 * @author (Charles Vitkus) 
 * @version (10-20-2023)
 */
import java.util.Scanner;
public class NumSorter
{
    public static void main(String [] args)
    {
          Scanner console = new Scanner(System.in);
          double a, b, c;
          
          System.out.print("Enter First number: ");
          a = console.nextDouble();
          System.out.print("Enter Second number: ");
          b = console.nextDouble();
          System.out.print("Enter Third number: ");
          c = console.nextDouble();
          
          if( a > c )//see's if a is bigger the c
          {
              if(a > b) //if a > c then it checks if a > b, if thats true then it goes and compares b and c
              {
                 if( b > c)
                 {
                     System.out.println(c);
                     System.out.println(b);
                     System.out.println(a);
                 }else{//if b isn't greater then c it'll run this code instead
                     System.out.println(b);
                     System.out.println(c);
                     System.out.println(a);
                    }
              }
          } 
          if(c > a){
              if(c > b)
              {
                  if(a > b)
                  {
                       System.out.println(b);
                     System.out.println(a);
                     System.out.println(c);
                  }else{//if instead b is greater then a it'll run this
                       System.out.println(a);
                     System.out.println(b);
                     System.out.println(c);
                    }//returns the smallest number 
              }
            }
          if( b > a)
          {
              if(b > c)
              {
                  if(c >a)
                  {
                      System.out.println(a);
                     System.out.println(c);
                     System.out.println(b);
                  } else
                  {
                      System.out.println(c);
                     System.out.println(a);
                     System.out.println(b);
                    }//returns the smallest number first
               }
           }
          }
   
}
