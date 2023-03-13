package javaprograme;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data: Input first binary number: 10
 * Input second binary number: 11
 * Expected Output: Sum of two binary numbers: 101
 */

public class TwoBinaryNumbers16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first binary number");
        String first = scanner.nextLine();

        System.out.println("Input second binary number");
        String second = scanner.nextLine();

        int num1 = Integer.parseInt(first,2);
        int num2 = Integer.parseInt(second, 2);

        int res = num1 + num2;

        System.out.println("res = num1 + num2: " + Integer.toBinaryString(res));

    }
}