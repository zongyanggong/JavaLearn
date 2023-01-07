/**
 * author:Zongyang Gong
 * Number:2295104
 * date:1/5/2023
 * version:1.0.0
 * description:
 */
public class Ambiguous {
    public static double max(double num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(int num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static void main(String[] args) {
        /*
         * This line will cause a compile time error
         * as reference to max is ambiguous
         */
        System.out.println(max(19, 20));
    }
}

