package cse215lab;

import java.util.Scanner;

public class Lab3Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        System.out.print("Enter a character : ");
        ch = scan.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println("It is a letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("It is a digit");
        } else {
            System.out.println("It is a symbol");
        }
    }
}
