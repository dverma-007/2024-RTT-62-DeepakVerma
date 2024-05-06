package org.example.GLAB_303_5_1;

public class DisplayFiveTimes {
    public static void main(String[] args) {
        int n = 5;

        for (n = 0; n < 5; n++) {
            // n = 0 is statement one, condition to execute the code block (System println)
            // as long as n < 5, n increases by one value after the code has been executed.
            //This becomes the new value of n when statement one runs for the next iteration.
            System.out.println("The value of n is " + n);
        }
    }
}
