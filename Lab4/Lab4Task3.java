
package cse215lab;

import java.util.Scanner;


public class Lab4Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        System.out.print("Enter a number : ");
        n = input.nextInt();
        
        double sum = 0;
        double term =1;
        for (int i = 1; i <=n; i++) {
            term =1.0/(double)(i*i);
            if(i%2==1){
                sum = sum +term;
            }
            else{
                sum = sum -term;
            }
        }
        System.out.printf("Sum : %.2f",sum);
}
}
