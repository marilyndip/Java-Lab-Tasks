
package cse215lab;

import java.util.Scanner;

public class Lab6Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int arr[]= new int[10];
        for (int i = 0; i < arr.length ; i++) {
             {
                System.out.print("Enter ["+i+"] = ");
                arr[i] = input.nextInt();
            }
        }
        
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                flag = 1;
                break;
        }
    
        }
        if(flag == 1)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }
}
