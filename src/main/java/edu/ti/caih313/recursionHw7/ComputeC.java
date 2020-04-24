package edu.ti.caih313.recursionHw7;

import java.util.Scanner;

public class ComputeC {

        public static void main(String[] args) {
            System.out.println("Enter a positive number: ");
            Scanner keyboard = new Scanner(System.in);
            int number = keyboard.nextInt();
            System.out.println("10 to the power of " + number + " is " + tenToTheN(number) + ".");
        }

        public static int tenToTheN(int n) {
            int value;
            if (n == 0) {
                value = 1;
            } else if (n == 1) {
                value = 10;
            } else if (n == 2) {
                value = 100;
            } else if (n % 2 == 0) {
                int valueHalf = tenToTheN(n / 2);
                value = valueHalf * valueHalf;
            } else {
                int valueHalfIsh = tenToTheN((n - 1) / 2);
                value = 10 * valueHalfIsh * valueHalfIsh;
            }
            return value;
        }
    }

