
package pkgclass.practice;

import java.util.Scanner;

public class L4T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.print("Enter an integer : ");
        N = input.nextInt();
        switch(N%2){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }
    }
    
}
