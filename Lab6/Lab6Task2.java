
package cse215lab;

import java.util.Scanner;

public class Lab6Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int arr[][]= new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter [" +i+ "]["+j+"] = ");
                arr[i][j] = input.nextInt();
            }
            
        }
        System.out.println("The matrix is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d",arr[i][j]);
                
            }
            System.out.println();
            
        }
        int sum =0;
        for (int i = 0; i < 3; i++) {
            sum = sum + arr[i][i];
        }
        System.out.print("The sum of the diagonal is : "+sum);
    }
}
