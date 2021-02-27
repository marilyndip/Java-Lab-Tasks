package cse215lab;

import java.util.Scanner;

public class Lab6Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n;
        System.out.print("Enter the number of rows : ");
        m = input.nextInt();
        System.out.print("Enter the number of columns : ");
        n = input.nextInt();

        int A[][] = new int[m][n];
        int B[][] = new int[m][n];
        int C[][] = new int[m][n];
        
        System.out.println("Enter the elements of first matrix : ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter [" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix : ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("Enter [" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();
            }
        }
        System.out.println("First matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", A[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("Second matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", B[i][j]);
            }
            System.out.println();
        }
        System.out.println("Sum : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j]=A[i][j]+B[i][j];
                System.out.printf("%4d", C[i][j]);
            }
            System.out.println();
        }
        
    }
}
