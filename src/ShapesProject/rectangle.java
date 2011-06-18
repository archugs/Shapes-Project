/*
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package overloading;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class rectangle extends shape{
double length,breadth,side;

    @Override
double calcPerimeter()
    {
    perimeter = 2*(length+breadth);
    return perimeter;
}

    @Override
double calcArea()
    {
    area=length*breadth;
  return(area);
    }

    @Override
    void getInput()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length in cms");
        length = s.nextInt();
        System.out.println("Enter the breadth in cms");
        breadth = s.nextDouble();
    }
}
