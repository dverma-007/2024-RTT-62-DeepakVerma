package org.example.GLAB_303_5_1;

public class PyramidExample {
    public static void main(String[] args){
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}