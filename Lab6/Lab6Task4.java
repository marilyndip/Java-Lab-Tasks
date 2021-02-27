package cse215lab;

import java.util.Scanner;

public class Lab6Task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;
        System.out.print("Enter the number of rows : ");
        row = input.nextInt();
        System.out.print("Enter the number of columns : ");
        col = input.nextInt();

        int A[][] = new int[row][col];
        int B[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter [" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%4d", A[i][j]);

            }
            System.out.println();
        }
        
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                B[i][j] = A[j][i];
            }

        }
        System.out.println("Transpose Matrix : ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("%4d", B[i][j]);
            }
            System.out.println();

        }

    }
}
