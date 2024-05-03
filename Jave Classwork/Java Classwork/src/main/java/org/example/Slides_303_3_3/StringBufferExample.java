package org.example.Slides_303_3_3;

public class StringBufferExample {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("filename.txt");

        // 012345678901
        //   filename.txt
        sb.insert(0, "new_");
        System.out.println(sb);

        // 0123456789012345
        // new_filename.txt

        sb.replace(0,4,"old_");

        //0123456789012345
        //old_filename.txt

        System.out.println(sb);

        // the thing to memorize for the KBA .. is  .. that ... replace is going to first delete the items
        //from 0 to 4 then insert the string at position start.
        sb.replace(0,4,"very_old");

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);

    }
}
