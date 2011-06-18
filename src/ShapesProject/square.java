/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package overloading;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class square extends rectangle {

square s;
rectangle r;


    @Override
void getInput()
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the side of square in cms");
    side = s.nextDouble();
    length = breadth = side;
}
}
