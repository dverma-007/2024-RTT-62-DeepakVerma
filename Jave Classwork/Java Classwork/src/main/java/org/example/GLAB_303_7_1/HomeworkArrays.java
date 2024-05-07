package org.example.GLAB_303_7_1;

import java.util.Random;
import java.util.*;

public class HomeworkArrays {
    public static void main(String[] args) {

       // assign an int variable with value 10
       int n = 10;

       //establish an array called randomArray that is an integer and has a max size of 10 values
       int[] randomArray = new int[n];

       //generate a random class using the Random utility and assign the value to random.
       Random random = new Random();

       // for loop used to loop through the randomArray from index 0 to i as long as it's
        //below n = 10 which gives 10 values in the randomArray.
        System.out.println("Given array ");
        for (int i = 0; i<n; i++) {

            //  the values in random Array are generated using the random.nextInt(method) which
            // generates values upto 100
            System.out.println(randomArray[i] = random.nextInt(100));
        }
           //
//           System.out.println("Random assigned value of Array are: ");
//            for (int value: randomArray) {
//               System.out.print(value + ", ");

//                I want you to get the smallest integer in the array
            int minValue = randomArray[0];
            for(int i = 0; i< randomArray.length; i++){
                if (randomArray[i] < minValue)
                    minValue = randomArray[i];
            }
        System.out.println("The smallest element present in the array is " + minValue);


//                4) I want you to get the largest integer in the array
            int maxValue = randomArray[0];
            for(int i = 0; i < randomArray.length; i++) {
                if (randomArray[i] > maxValue)
                    maxValue = randomArray[i];
            }
        System.out.println("The largest value in the array is " + maxValue);

//                5) I want you to calculate the average value in the array as a double.
//                Average is the sum of all elements in the array divided by the length of
//                the array
        double subTotal = 0;
        double avgRand = 0;
        for(int i = 0; i < randomArray.length; i++) {
            subTotal = randomArray[i]+subTotal;
            avgRand = subTotal / randomArray.length;
        }
        System.out.println("The average is " + avgRand);
           }
       }


