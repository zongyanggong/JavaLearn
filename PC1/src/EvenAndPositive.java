/**
 * Name: Zongyang Gong
 * Student ID: 2295104
 */

public class EvenAndPositive {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        boolean even = (number % 2 ==0);
        boolean positive = (number>0);

        System.out.println(number + " is an even number: "+even);
        System.out.println(number + " is a positive number: "+positive);
        System.out.println(number + " is a positive even number: "+ (positive && even));

    }
}
