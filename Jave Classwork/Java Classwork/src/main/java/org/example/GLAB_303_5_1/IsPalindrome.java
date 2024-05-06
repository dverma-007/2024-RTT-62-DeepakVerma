package org.example.GLAB_303_5_1;
import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
//        System.out.println("Enter in the number you want to check");
//        int originalNum = number.nextInt();
//        System.out.println("The stored number is " +originalNum);
//        int reversedNum = 0;
//        int numLength = originalNum.length();
//        for(int i = numLength-1; i>=0; i--)
//            reverse = reverse + original.charAt(i);
//        if(original.equals(reverse)) {
//            System.out.println("Entered string / number is a palindrome. ");
//        } else
//        {
//            System.out.println("Entered string / number isn't a palindrome. ");

            String original, reverse = ""; // Objects of String class
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a string/number to check if it is a palindrome");
            original = in.nextLine();
            int length = original.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + original.charAt(i);
            if (original.equals(reverse)) {
                System.out.println("Entered string/number is a palindrome.");
            }else
            {
                System.out.println("Entered string/number isn't a palindrome.");

            }
    }
}
