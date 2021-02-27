package cse215lab;

import java.util.Scanner;

public class Lab5Task3 {

    public static boolean isPrime(int N) {
        if (N == 0 || N == 1) {
            return false;
        } else {
            for (int i = 2; i <= N / 2; i++) {
                if (N % i == 0) {
                    return false;
                }

            }
        }
        return true;

    }

    public static void generatePrime(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = input.nextInt();
        System.out.print("Enter b : ");
        b = input.nextInt();
        

        System.out.printf("Prime number between %d and %d is :", a, b);
        System.out.println();

        generatePrime(a, b);
    }
}
