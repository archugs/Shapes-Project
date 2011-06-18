/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package overloading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Main {
   int choice;;
   int perchoice;
   int areachoice; 
   Scanner s;


public void getChoice()
    {
    System.out.println("Enter your choice");
    System.out.println("1.Calculate perimeter\n 2.Calculate area\n 3.Exit\n");
    s = new Scanner(System.in);
    choice = s.nextInt();
    }
public void getPerimeterChoice()
    {
    System.out.println("Find perimeter of what:");
    System.out.println("1.rectangle\n 2.square\n 3.circle\n 4.Back\n");
    perchoice = s.nextInt();
    }
public void getAreaChoice()
    {
    System.out.println("Find area of what:");
    System.out.println("1.rectangle\n 2.square\n 3.circle\n 4.Back\n");
     areachoice = s.nextInt();
    }
public void getResult()
    {
  Main m = new Main();
  shape p;
  m.getChoice();

  switch(m.choice)
  {
  case 1:
    {
      while(true)
        {
         m.getPerimeterChoice();
         switch(m.perchoice)
            {
            case 1:
                {
                p = new rectangle();
                p.getInput();
                p.calcPerimeter();
                p.disp(m.choice,p.getClass());
                break;
                }
           case 2:
                {
                p = new square();
                p.getInput();
                p.calcPerimeter();
                p.disp(m.choice,p.getClass());
                break;
                }
           case 3:
                {
                p = new circle();
                p.getInput();
                p.calcPerimeter();
                p.disp(m.choice,p.getClass());
                break;
                }
           case 4:
                {
                
                m.getResult();

                }
           default:
                {
                System.out.println("invalid choice. Enter a choice 1-3");
                break;

                }
            }
        }

     }
      case 2:

         {
         while(true)
           {
           m.getAreaChoice();
           switch(m.areachoice)
              {
              case 1:
                    {
                    
                    p = new rectangle();
                    p.getInput();
                    p.calcArea();
                    p.disp(m.choice,p.getClass());
                    break;
                    }
             case 2:
                    {
                    p = new square();
                    p.getInput();
                    p.calcArea();
                    p.disp(m.choice,p.getClass());
                    break;
                    }
            case 3:
                    {
                    p = new circle();
                    p.getInput();
                    p.calcArea();
                    p.disp(m.choice,p.getClass());
                    break;
                    }
            case 4:
                     {
                    
                   m.getResult();
                     }
            default:
                    {
                    System.out.println("invalid choice. Enter a choice 1-3");
                    break;
                    }
                  }
                }

              }
     case 3:
      {
       System.exit(0);
       }
      default:
       {
       System.out.println("invalid choice. Enter 1 or 2 ");
       m.getResult();
       }
    }

}

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
 Main  m = new Main();
 m.getResult();
  }
    }


