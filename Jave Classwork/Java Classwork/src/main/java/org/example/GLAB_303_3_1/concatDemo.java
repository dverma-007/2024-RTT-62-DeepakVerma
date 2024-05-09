package org.example.GLAB_303_3_1;

public class concatDemo {
    public static void main(String[] args){
        String str1 = "Learn";
        String str2 =  " Java ";
        System.out.println(str1.concat(str2));
        System.out.println(str2.concat(str1));

        String str3 = "Hello ";
        String str4 = "Learners ";
        System.out.println(str3.concat(str4));
        System.out.println(str4.concat(str3));

        String s5 = str3 + str4;
        System.out.println(s5);

        String message = "Welcome" + "to" + "Java";
        System.out.println(message);

        String s = "Chapter " + 2;
        System.out.println(s);


    }
}
