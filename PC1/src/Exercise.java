
import java.util.Scanner;

/**
 * author:Zongyang Gong
 * Number:2295104
 * date:1/5/2023
 * version:1.0.0
 * description:test shortString and reverseString methods
 */
public class Exercise {

    /**
     * take two strings as input and returns the string whose first letter comes first in the alphabet
     * ignore the upperletter and lowerletter of first letter
     * If the two strings both with the same first letter,then return the shortest between the two.
     * If the two strings both with the same first letter and same length, return either one of them.
     * @param str1:the first input string
     * @param str2:the second input string
     * @return:String
     */
    public static String shortString(String str1,String str2){
        String firstLetter1 = str1.substring(0,1);
        String firstLetter2 = str2.substring(0,1);
        if (!firstLetter1.equalsIgnoreCase(firstLetter2))
            return (firstLetter1.compareToIgnoreCase(firstLetter2)<0)?str1:str2;
        else
            return (str1.length()<str2.length())?str1:str2;
    }

    /**
     * Take one string as input to return reversed string
     * @param str:string to be reversed
     * @return:revrsed string
     */
    public static String reverseString(String str) {
        if (str.length()>0) {
            StringBuilder reverseStr = new StringBuilder();
            for (int i=str.length()-1;i>=0;i--) {
                reverseStr.append(str.charAt(i));
            }
            return reverseStr.toString();
        }
        else return "";
    }

    public static void main(String[] args) {
        System.out.println("Test shortString method:");
        System.out.println("Please input first string:");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println("Please input second string:");
        String str2 = scanner.nextLine();
        System.out.println("The result is " + shortString(str1,str2));

        System.out.println();
        System.out.println("*****************************");
        System.out.println("Test reverseString method:");
        System.out.println("Please input the string to be reversed:");
        String toBeReversed = scanner.nextLine();
        System.out.println("The reversed string is "+reverseString(toBeReversed));
    }
}
