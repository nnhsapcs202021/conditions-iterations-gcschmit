import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Average
     * reads a series of numbers (ends with a letter)
     * calculates the average of the numbers
     * @return the average of the numbers
     */
    public static double average()
    {
        int sum = 0;
        int count = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter an integer value (or a letter to stop): ");
        while(s.hasNextInt())
        {
            int value = s.nextInt();
            sum += value;
            count++;

            System.out.print("Please enter an integer value (or a letter to stop): ");
        }
        double average = (double)sum / count;
        return average;
    }

    /*
     * Loop Algorithm #2: Counting Matches
     * reads a series of numbers (ends with a letter)
     * counts the number of numbers that are greater than 100
     * @return the number of numbers that are greater than 100
     */
    public static int countMatches()
    {
        Scanner s = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter an integer value (or a letter to stop:) ");
        while(s.hasNextInt())
        {
            int nextValue = s.nextInt();
            if (nextValue > 100)
            {
                count++;
            }
            System.out.print("Enter an integer value (or a letter to stop:) ");
        }
        return count;
    }

    /*
     * Loop Algorithm #3: Finding the First Match
     * reads a series of words separated by whitespace
     * continues to read and count words until a word is longer than five characters
     * @return the number of words read before the match
     */
    public static int findFirstMatch()
    {
        Scanner s = new Scanner(System.in);
        //The count of words that we add as we read through the string
        int count = 0;

        //The user question that is only run once
        System.out.print("Input a string you want to find a match in: "); 

        //As long as the next word is not longer than five characters,
        //  we will continue to read
        while(s.next().length() < 6) 
        {
            //As we read each new word, we increment count to show we're counting
            //  the number of words we read
            count++; 
        }
        return count;
    }

    /*
     * Loop Algorithm #4: Prompting until a Match Is Found
     * prompts the user to enter a positive integer less than 100
     * reads the number
     * continues to prompt the user until the number matches the criteria
     * @return the number that matched the criteria
     */
    public static int promptUntilMatch()
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        do
        {
            System.out.println("Enter a number:");
            num = scanner.nextInt();           
        }
        while(num >= 100);
        return num;
    }

    /*
     * Loop Algorithm #5: findMax
     * reads a series of numbers (ends with a letter)
     * @return the greatest number
     */
    public static int findMax() 
    {
        Scanner s = new Scanner(System.in);
        int maxnum = Integer.MIN_VALUE;

        System.out.print("Please input a number (end the loop with a letter): ");
        while (s.hasNextInt())
        {
            int curnum = s.nextInt();
            if (curnum >= maxnum)
            {
                maxnum = curnum;
            }
            System.out.print("Please input a number (end the loop with a letter): ");
        }
        return maxnum;
    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers until an adjacent duplicate
     * number is entered
     * @return the adjacent duplicate number that was entered
     */
    public static int compareAdjacent()
    {
        int n1 = 0;
        int n2 = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer number:");
        n1 = s.nextInt();
        System.out.print("Enter another integer number:");
        n2 = s.nextInt();
        while(n1 != n2)
        {
            n1 = n2;
            System.out.print("Enter integer number:");
            n2 = s.nextInt();
        }
        return n2;

    }

    /*
     * Loop Algorithm #7: Identify Individual Digits in an Integer (Extension)
     * Write an algorithm to identify the individual digits in an integer.
     * For example, if the integer 123456 is entered by a user, print each digit on its own line.
     * @return the adjacent duplicate number that was entered
     */
    public static void identifyDigits(int intValue)
    {
        String string = Integer.toString(Math.abs(intValue));

        for (int i = string.length() - 1; i > -1; i--)
        {
            System.out.println(string.charAt(i));
        }
    }

}