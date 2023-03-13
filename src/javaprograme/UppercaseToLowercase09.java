package javaprograme;
/**
 * Write a program to convert the upper case to lower case
 */

import java.util.Scanner;

public class UppercaseToLowercase09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String: ");
        String line = scanner.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        scanner.close();
    }
    }

