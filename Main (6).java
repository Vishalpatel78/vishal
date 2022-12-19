/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java .util.Scanner;
class Triangle
{
      Scanner sc= new Scanner(System.in);
     void f1()
     {
         int h,b;
         float area;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the height of the triangle");
            h=sc.nextInt();
            System.out.println("Enter the width of the triangle");
            b=sc.nextInt();
            area=(h*b)/2;
             System.out.println("area of triangle is "+area);
     }
}
public class Main extends Triangle
{
    void f2()
    {
        int a,b;
        float area_rect;
        System.out.println("Enter the height of the rectangle");
        a=sc.nextInt();
         System.out.println("Enter the  of the rectangle");
        b=sc.nextInt();
        area_rect=a*b;
         System.out.println("area of rectangle is "+area_rect);
        
    }
    public static void main(String[] args)
    {
        Main ob = new Main();
        ob.f1();
        ob.f2();
    }
    
}