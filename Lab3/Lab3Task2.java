package pkgclass.practice;

import java.util.Scanner;

public class L3T2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,N;
        System.out.print("How many random numbers : ");
        N = input.nextInt();
        int min = 5, max = 20;
        for (int i = 0; i <N; i++) {
            n = (int) (min + Math.random()*(max-min+1));
            System.out.print(n+" ");
        }
    }
}
