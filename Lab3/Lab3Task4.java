
package pkgclass.practice;

import java.util.Scanner;

public class L3T4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city1,city2;
        System.out.print("Enter 1st city : ");
        city1 = input.nextLine();
        System.out.print("Enter 2nd city : ");
        city2 = input.nextLine();
        System.out.println(city1.compareTo(city2));
        System.out.println(city2.compareTo(city1));
        if(city1.compareTo(city2)<0){
            System.out.println(city1+ " and "+city2);
        }
        else if(city1.compareTo(city2)>0){
            System.out.println(city2+ " and "+city1);
        }
        else{
            System.out.println(city1+ " and "+city2);
        }
}
}
