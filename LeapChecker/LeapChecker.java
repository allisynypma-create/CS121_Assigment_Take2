import java.util.Scanner;
public class LeapChecker
{
    public static void main (String [] args)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = kbd.nextInt();
    
        if (year < 1582)
        {
            System.out.println("ERROR: not valid in Gregorian calendar");
            System.exit(1);
        }
        if(year % 100 == 0 && year % 400 != 0)
        {
            System.out.println(year + " is not a leap year");
        }
        else if (year % 4 == 0) 
        {
            System.out.println(year + " is a leap year");
        }
        else 
        {
            System.out.println(year + " is not a leap year");
        }
         /* Clean up our toys when we're done with them */
        kbd.close();
        }
    }

 
