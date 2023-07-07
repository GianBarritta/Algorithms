package Fibonacci;

import java.util.Scanner;

/**
 * Fibonacci algorithm.
 */
public class Fibonacci {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int c;
        int n;

        System.out.println("Please enter the number of elements for the series: ");
        n = keyboard.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;

        }

    }
}