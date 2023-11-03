package javaprogrammes;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 * Before the user enters the number, print the message Enter number:
 * If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * Use an endless while loop.
 * Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme_2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        boolean firstInput = true;

        while (true){
            System.out.println("Enter number: ");

            if (scanner.hasNextInt()){
                int number = scanner.nextInt();

                if (firstInput){
                    min = number;
                    max = number;
                    firstInput = false;
                }else {
                    if (number < min){
                        min = number;
                    }
                    if (number > max){
                        max = number;
                    }
                }
            }else {
                break;//Exit the loop on invalid input
            }
            //Consume the newline character
            scanner.nextLine();
        }
        if(!firstInput){
            System.out.println("Minimum number entered:" + min);
            System.out.println("Maximum number entered: " + max);
        }else {
            System.out.println("No valid numbers entered.");
        }scanner.close();

    }
}

