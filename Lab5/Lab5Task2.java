
package cse215lab;

import java.util.Scanner;


public class Lab5Task2 {
    public static int getSum(int N){
        int rem,sum=0;
        while(N!=0){
            rem = N%10;
            sum = sum + rem;
            N= N/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num= input.nextInt();
        
        System.out.println("Sum of digits : "+getSum(num));
        
    }
}
