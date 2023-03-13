package javaprograme;
/**
 * Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class SwapTwoVariables15 {

    public static void main(String[] args) {
        int x, y, z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two number: ");
        x = scanner.nextInt();
        y = scanner.nextInt();

        z = x;
        x = y;
        y = z;
        System.out.println("Swap two variables are: " + x + " and " + y);
    }
}
