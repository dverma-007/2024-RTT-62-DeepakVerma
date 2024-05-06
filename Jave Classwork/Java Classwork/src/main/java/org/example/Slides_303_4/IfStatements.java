package org.example.Slides_303_4;

public class IfStatements {
    public static void main(String[] args) {
        int x = 9;
        x = test(x);

        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x < 20){
            System.out.println("Less than 20");
        } else if (x < 30){
            System.out.println("Less than 30");
        } else if (x < 40) {
            System.out.println("Greater than 30");}

        if (x < 10) {
            System.out.println("Less than 10");
        }  if (x < 20){
            System.out.println("Less than 20");
        }  if (x < 30){
            System.out.println("Less than 30");
        }  if (x < 40) {
            System.out.println("Greater than 30");
        }
    }


public static int test(int x){
    x= x+1;
    return x;
}
}