
package cse215lab;

import java.util.Scanner;

public class Lab4Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N;
        System.out.print("Enter N : ");
        N = input.nextInt();
        
        for (int i = 1; i <=N; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
            
        }
    }
}
