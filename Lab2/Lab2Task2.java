package cse215lab;

import java.util.Scanner;

public class Lab2Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter operator : ");
        char op = input.next().charAt(0);
        int a, b;
        System.out.print("Enter 1st operand : ");
        a = input.nextInt();
        System.out.print("Enter 2nd operand : ");
        b = input.nextInt();

        switch (op) {
            case '+':
                System.out.println("Result is : " + (a + b));
                break;
            case '-':
                System.out.println("Result is : " + (a - b));
                break;
            case '*':
                System.out.println("Result is : " + (a * b));
                break;
            case '/':
                System.out.println("Result is : " + (a / b));
                break;
            default:
                System.out.println("Invalid operator");
        }

    }

}
