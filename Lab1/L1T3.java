
package pkgclass.practice;

import java.util.Scanner;

public class L1T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.print("Enter a number : ");
        N = input.nextInt();
        if(N%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
