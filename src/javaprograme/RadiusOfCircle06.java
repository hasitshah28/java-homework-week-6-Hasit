package javaprograme;

import java.util.Scanner;

public class RadiusOfCircle06 {
   static double radius, area;
   static double pi = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        area = pi * radius * radius;
        System.out.println("Area of the circle is : " + area);
        scanner.close();



    }

}
