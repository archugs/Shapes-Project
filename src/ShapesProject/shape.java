/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package overloading;

/**
 *
 * @author user
 */
public class shape {
   double area;
   double perimeter;
  
   void getInput(){}
   double calcPerimeter()
    {
       return(perimeter);
   }

double calcArea()
{
  return(area);
}

void disp(int choice,Class shape)
    {
    if(choice == 1)
    System.out.println("The perimeter of "+shape.getSimpleName()+" is " +perimeter);
    else
    System.out.println("The area of "+shape.getSimpleName()+" is " +area);
}
}
