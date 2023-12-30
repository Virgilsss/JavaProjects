
/**
 * Write a description of class TriangleDriver here.
 * 
 * @author (Charles Vitkus) 
 * @version (12/29/2023)
 */
public class TriangleDriver
{
 public static void main(String [] args)
 {
     Triangle tg = new Triangle(1,2,3,4,7,8);
     System.out.println(tg.distanceFromOnetoTwo());// length from point 1 to 2
     System.out.println(tg.distanceFromTwotoThree());//length from point 2 to 3
     System.out.println(tg.distanceFromThreetoOne());// length from point 3 to 1
     System.out.println(tg.perimeter()); // the perimetere of triangle
     System.out.println(tg.area());// prints out the area
     
 }
}
