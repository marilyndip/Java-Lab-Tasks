package cse215lab;

import java.util.Scanner;

public class Lab2Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N;
        System.out.print("Enter N :");
        N = scan.nextInt();

        int i = 1, sum = 0;
        while (i <= N) {

            System.out.print("Enter a number : ");
            int a = scan.nextInt();
            sum = sum + a;
            i++;
        }

        System.out.println("The sum is : " + sum);
    }
}
