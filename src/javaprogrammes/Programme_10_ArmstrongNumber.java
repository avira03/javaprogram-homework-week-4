package javaprogrammes;

import java.util.Scanner;

/*Write a program to input any number and check if it Armstrong number or not
  153 = (1*1*1)+(5*5*5)+(3*3*3)
  where:
  (1*1*1)=1
  (5*5*5)=125
  (3*3*3)=27
  So:
  1+125+27=153
 */
public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)){
            System.out.println(number + " is an ArmstrongNumber. ");
        }else{
            System.out.println(number + " is an not an ArmstrongNumber. ");
        }
        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }

        return originalNumber == result;
    }
}

