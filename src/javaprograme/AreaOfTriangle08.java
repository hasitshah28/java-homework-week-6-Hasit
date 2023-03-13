package javaprograme;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class AreaOfTriangle08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the Triangle: ");
        double b = scanner.nextDouble();

        System.out.println("Enter the height of the Triangle");
        double h = scanner.nextDouble();

        double area = (b*h)/2;
        System.out.println("Area of a triangle is: " + area);
        scanner.close();

    }
}
