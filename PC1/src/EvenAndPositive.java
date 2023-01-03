/**
 * Name: Zongyang Gong
 * Student ID: 2295104
 */

import java.util.Scanner;

public class EvenAndPositive {
    public static void main(String[] args) {
        System.out.print("> run EvenAndPositive ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean even = (number % 2 ==0);
        boolean positive = (number>0);

        System.out.println(" " + number + " is an even number: "+even);
        System.out.println(" " + number + " is a positive number: "+positive);
        System.out.println(" " + number + " is a positive even number: "+ (positive && even));

    }
}
