
package cse215lab;

import java.util.Scanner;


public class Lab3Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b,gcd=1;
        System.out.print("Enter a = ");
        a = scan.nextInt();
        System.out.print("Enter b = ");
        b = scan.nextInt();
        
        for (int i = 1; i <=a && i<=b; i++) {
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD = "+gcd);
}
}
