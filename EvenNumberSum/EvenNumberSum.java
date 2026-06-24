import java.util.Scanner;

public class EvenNumberSum
{
    public static void main(String [] args)
    {
        /* Input Processing */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int integer = scan.nextInt();

        /* Integer must be > 2 or Error occurs */
        if (integer < 2)
            {
                System.out.print("The value must be greater than two.");
                System.exit(1);
            }

            int sum = 0;
            int firstNumber = 2; 

        /* Loop until it hits the integer value */
        while (firstNumber <= integer)
        {
        if (firstNumber % 2 == 0)
            {
                /* add the first number (2) so it counts in the total */
                sum = sum + firstNumber;
            }
            /* add 1 so it checks other numbers and doesn't repeat forever */
            firstNumber = firstNumber + 1;   
        }

        System.out.println("The sum of the even integers from 2 to " + integer + " is " + sum);

        /* Done with Scanner, so close it. */
         scan.close();
    }
}

