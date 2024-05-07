package org.example.Slides_303_6;

public class ArrayDelete {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
       // System.out.println("The original array is "+ array[]);
        // pos 01234
        //value 12345

        //now lets delete item at position 4
        //pos 01234
        //value 1245

        int deletedPosition = 1;

        if(deletedPosition < 0 || deletedPosition > array.length){
            System.out.println("Position to delete is invalid");
        }
        // 1) create a new array with size - 1
        int[] deleted = new int[array.length - 1];

        //2 copy the first elements upto but not including the deleted position

        for (int pos = 0; pos < deletedPosition; pos++) {
            deleted[pos] = array[pos];

            //this prints out the index number
            System.out.println(pos);

            //this prints out the value in the above index
            System.out.println(deleted[pos]);
        }
        // 3) copy the last elements into a pos-1 in the new array

        for (int pos = deletedPosition; pos < array.length; pos++) {
            deleted[pos - 1] = array[pos];
        }
        for (int value : deleted) {
            System.out.println(value);
        }
    }
}
