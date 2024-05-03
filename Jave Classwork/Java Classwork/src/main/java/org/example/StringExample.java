package org.example;

public class StringExample {
    public static void main (String[] args){
        String str = "Whatever you want to type in this string is okay.";

        System.out.println("The length of the sting = " + str.length());

        String str2 = str.toUpperCase();
        // this won't modify the string str.  It sets up a new string str2

        System.out.println(str);
        System.out.println(str2);
        //                 1234567890
        //                 0123456789
        String filename = "document.pdf";
        System.out.println("The fil name is "+ filename + " and the length is " + filename.length());

        System.out.println("The period is at index "+ filename.indexOf("."));

        System.out.println("The file extension is " + filename.substring(filename.indexOf(".") + 1));

        // the first argument is inclusive but the second argument is not inclusive (doesn't include the .)
        System.out.println("The name of the file is "+ filename.substring(0,filename.indexOf(".")));

    }
}
