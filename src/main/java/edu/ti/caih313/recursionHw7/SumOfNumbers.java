package edu.ti.caih313.recursionHw7;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        System.out.println("enter a positive number:");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println("The sum of the digits in the number entered is "+ getSum(number)+"-");

    }
    public static int getSum(int n){
        return n==0?0:n%10+getSum(n/10);
    }
}
