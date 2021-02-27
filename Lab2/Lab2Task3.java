package cse215lab;

import java.util.Scanner;

public class Lab2Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N;
        System.out.println("Enter N :");
        N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print("*");

                }
            } else {
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print("+");
                }

            }
            System.out.println();

        }
    }
}
