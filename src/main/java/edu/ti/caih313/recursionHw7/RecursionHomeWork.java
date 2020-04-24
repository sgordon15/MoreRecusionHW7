package edu.ti.caih313.recursionHw7;

import java.util.Scanner;

public class RecursionHomeWork {
    private static int count = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        countOdd(n);
        System.out.println("The number of odd digits is " + count);
        in.close();
    }

    public static void countOdd(int number) {

        int remainder = number % 10;
        int quotient = (number - remainder) / 10;

        if (!(remainder % 2 == 0)) {
            count++;
        }

        number = quotient;
        if (number < 10) {
            if (!(number % 2 == 0)) {
                count++;
            }
        } else {
            countOdd(number);
        }
    }

}