package org.example.Slides_303_4;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExample {

    public static void main(String[] arg) {

        for (int count = 10; count > 10; count++) {
            if (count % 2 == 0) {
                System.out.println("This is an even number");

                    for (int d = 0; d < 5; d++) {
                        System.out.println("The count = " + count + "." + d);
                    }
                }
            }
            List<String> stringList = new ArrayList<>();
            stringList.add("First Element");
            stringList.add("2nd Element");
            stringList.add("3rd Element");
            stringList.add("4th Element");
            stringList.add("5th Element");

            // we can use an old style for loop to move across this list
            for (int pos = 0; pos < stringList.size(); pos++) {
                System.out.println(stringList.get(pos));
            }
            // we can use an old style for loop to move across this list
            for (int pos = stringList.size(); pos >=0; pos++) {
                System.out.println(stringList.get(pos));
        }

            System.out.println("---------------------------------------------");

            //nice new for loop
            for (String element : stringList){
                System.out.println(element);
                if (element.equals("Three")) {
                    continue;
                }
                System.out.println(element);
            }
    }
}