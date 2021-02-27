
package cse215lab;

import java.util.Scanner;

public class Lab5Task1 {
    public static int isPerfect(int N){
        int sum =0;
        for (int i = 1; i < N; i++) {
            if(N%i==0){
                sum= sum +i;
            }
        }
        if(sum==N){
            return 1;
        }
        else{
           return 0;
    }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter n : ");
        n = input.nextInt();
        
        for (int i = 2; i <= n; i++) {
            if(isPerfect(i)==1){
            System.out.println(i);
        }
            
    }
}
}
