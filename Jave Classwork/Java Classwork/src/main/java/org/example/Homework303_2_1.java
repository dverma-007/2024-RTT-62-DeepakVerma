package org.example;

public class Homework303_2_1 {
    public static void main(String[] args){

//        Write a program that declares two integer variables, assigns an integer to
//        each, and adds them together. Assign the sum to a variable.
//        Print out the result.

        int num1 = 10;
        int num2 = 30;
        int sum = num1 + num2;
        System.out.println("The sum of num1 + num2 = "+ sum);

//        Write a program that declares two double variables, assigns a number to each,
//        and adds them together. Assign the sum to a variable. Print out the result.
        double var1 = 10.1d;
        double var2 = 15.3d;
        var sum1 = var1 + var2;
        System.out.println("The sum of var1 + var2 = " + sum1);

//        Write a program that declares an integer variable and a double variable,
//        assigns numbers to each, and adds them together. Assign the sum to a variable.
//        Print out the result. What variable type must the sum be?

        int x1 = 30;
        double y1 = 50.55d;
        double sum3 = x1 + y1;
        System.out.println("The sum of x1 + y1 = " +sum3);

//        Write a program that declares two integer variables, assigns an integer to
//        each, and divides the larger number by the smaller number.
//        Assign the result to a variable. Print out the result.
//        Now change the larger number to a decimal. What happens?
//        What corrections are needed?

        int d = 20;
        int f = 45;
        double divAnswer = (double)f / (double)d;
        System.out.println("The division of f divided by d = "+ divAnswer);


//        Write a program that declares two double variables, assigns a number to each,
//        and divides the larger by the smaller number. Assign the result to a variable.
//        Print out the result. Now, cast the result to an integer.
//        Print out the result again.
            double var3 = 15.5;
            double var4 = 13.456;
            double divAns = var3/var4;
            System.out.println("The division of var3 divided by var4 = " + divAns);

            int divAns2 = (int) divAns;
            System.out.println("The integer value of the dividend is "+ divAns2);


//        Write a program that declares two integer variables, x and y, and assigns the
//        number 5 to x and the number 6 to y. Declare a variable q and assign y/x to it
//        and print q. Now, cast y to a double and assign it to q. Print q again.

        int x = 5;
        int y = 6;
        double q = (double) y / (double) x;
        System.out.println(q);
        q = (double) y;
        System.out.println(q);

//        Write a program that declares a named constant and uses it in a calculation.
//        Print the result.
        final int JOHN_AGE = 56;
        int v = 4;
        double sumConstant = JOHN_AGE + v;
        System.out.println("The final answer of adding the constant, JOHN_AGE + integer v = " +sumConstant);


//        Write a program where you create three variables that represent products at a
//        cafe. The products could be beverages like coffee, cappuccino, espresso,
//        green tea, etc. Assign prices to each product. Create two more variables called
//        subtotal and totalSale and complete an “order” for three items of the first
//        product, four items of the second product, and two items of the third product.
//        Add them all together to calculate the subtotal. Create a constant called
//        SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
//        Be sure to format the results to two decimal places.
//
        double COFFEE = 4.50;
        double TEA = 4.00;
        double COKE = 2.50;
        double SALES_TAX = 0.045;
        double subTotal = (3*COFFEE) + (4*TEA) + (2*COKE);
        double totalSale = subTotal + (subTotal * SALES_TAX);
        System.out.println("The Sub Total is "+ subTotal);
        System.out.println("The Total Sale is " + totalSale);

        String formattedSale = String.format("%.2f", totalSale);
        System.out.println("Total Sale     "+ formattedSale + "");

    }
}
