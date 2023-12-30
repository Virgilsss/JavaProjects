
/**
 * Write a description of class Triangle here.
 * 
 * @author (Charles Vitkus) 
 * @version (12/29/2023)
 */
public class Triangle
{
    private final double x;//x of first point
    private final double y;//y point that goe with the first triangles x
    
    
    private final double a;//the x point of second point, bc a comes before b, x before y
    private final double b;//pairs with a, this is the equivalent of y in (x,y) second point
    
    private final double c;//this will pair with d, equivalent of x, in (x,y)
    private final double d;//pairs with c, is equivlaent of y in, (x,y) 3rd point
    
    private double d1;//the distance from point 1 to two
    private double d2;//distance from point 2 to 3
    private double d3;//I know you dont need this itll just make it easier for me
    private double perimeter;
    private double A; // for Heron’s Formula
    private double S; // for Heron’s Formula
    
    public Triangle(double x, double y, double a, double b, double c, double d)
    {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void  pointOne()
    {
        System.out.print(x + " + " + y); 
        
    }
    
    public void  pointTwo()
    {
        System.out.print(a + " + " + b); 
        
    }
    
    public void  pointThree()
    {
        System.out.print(c + " + " + d); 
        
    }
    
    public double distanceFromOnetoTwo()//find the length of the line for point 1 to 2
    {
        d1 = Math.sqrt(Math.pow((x-a),2) + Math.pow((y-b),2));
        /*the distance from point 1 to
        point 2 using the distance formula*/
        return d1;
    }
    
    public double distanceFromTwotoThree()//finds the length of the line from 2 to 3

    {
        d2 = Math.sqrt(Math.pow((a-c),2) + Math.pow((b-d),2));
        return d2;
    }
    
    public double distanceFromThreetoOne()//length of 3 to 1, completeing the triangle

    {
        d3 = Math.sqrt(Math.pow((c-x),2) + Math.pow((d-y),2));
        return d3;
    }
    
    public double perimeter()
    {
        perimeter = d3 + d2 + d1;
        return perimeter;
    }
    
    public double area()
    {
        S = (d1 + d2 + d3)/2; // the S in Heron’s Formula
        A = Math.sqrt(S*(S-d1)*(S-d2)*(S-d3)); //the  A in Heron’s Formula
        return A;//returns the area using Heron’s Formula
        
    }


}
