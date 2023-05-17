package homework_week2_divyesh;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class Prog8_AreaTri {
    public static void main(String args[]) {
      Match();

    }
    public static void Match(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the width of the Triangle:");
        double a = s.nextDouble();
        System.out.println("Enter the height of the Triangle:");
        double b = s.nextDouble();
        double area = (a * b) / 2;
        System.out.println("Area of Triangle is: " + area);
    }
}
