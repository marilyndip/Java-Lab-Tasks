package cse215lab;

import java.util.Scanner;

public class Lab2Task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c;
        System.out.println("Enter the coefficients: ");

        System.out.print("a : ");
        a = scan.nextInt();
        System.out.print("b : ");
        b = scan.nextInt();
        System.out.print("c : ");
        c = scan.nextInt();

        double discriminant = ((b * b) - (4 * a * c));
        double sqrt = Math.sqrt(discriminant);

        double Root1 = 0, Root2 = 0;
        if (discriminant > 0) {
            Root1 = (-b + sqrt) / (2 * a);
            Root2 = (-b - sqrt) / (2 * a);

            System.out.print("Root 1: ");
            System.out.printf("%.2f", Root1);
            System.out.println();
            System.out.print("Root 2: ");
            System.out.printf("%.2f", Root2);
        } 
        
        else if (discriminant == 0) {
            System.out.println("Root is : " + (-b + sqrt) / (2 * a));
        } 
        
        else {
            System.out.println("The roots are not real");
        }

    }
}
