/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package overloading;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author user
 */
public class circle extends shape{
    double radius;
   

    @Override
double calcPerimeter()
    {
    perimeter = 2*Math.PI*radius;
    return perimeter;
    }

    @Override
        double calcArea()
    {

           area = Math.PI*radius*radius;
           return area;

     }

    @Override
    void getInput()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of circle in cms");
        radius = (s.nextDouble());

    }
}
