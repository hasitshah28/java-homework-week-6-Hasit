package javaprograme;
/**
 * Write a program to insert any temperature value in degree Fahrenheit and convert
 * to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class TemConvert07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert temperature value in degree Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = ((fahrenheit -32) * 5/9);
        System.out.println("degree Fahrenheit is equal to : " + celsius + " in celsius");
        scanner.close();

    }
}
