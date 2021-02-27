
package cse215lab;

import java.util.Scanner;


public class Lab4Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter a number : ");
        num = input.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0){
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("It is Prime");
        }
        else
        {
            System.out.println("The number is not prime");
        }
    }
}
