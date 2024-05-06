package org.example.GLAB_303_5_1;

public class DisplaySumNatNumbs {
    public static void main(String[] args) {
        //Program to find the sum of natural numbers from 1 to 1000
        int n = 1;
        int sum = 0;
        for (n = 1; n <= 1000; n++) {
            System.out.println("The natural number is " + n);
            sum = sum + n;
            System.out.println("The sum of the natural numbers is " + sum);

//            int sum = 0;
//            int n = 1000;
//            // for loop
//            for (int i = 1; i <= n; ++i) {
//                // body inside for loop
//                sum += i;     // sum = sum + i
//            }
//            System.out.println("Sum = " + sum);

        }
    }
}

