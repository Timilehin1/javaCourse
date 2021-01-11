package javapractice;

import java.util.Scanner;

public class GrossPayCalculator {
    //Default method in java
    public static void main(String arg[]){
        //Get the number of hours worked
        System.out.println("Enter number of hours worked");
        //to receive input in java, use the code below
        Scanner scanner = new Scanner(System.in);
        //scanner.nextInt();
        //store information as a variable
        int hours = scanner.nextInt();

        //Get the hourly pay rate
        System.out.println("Enter Pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //Multiply hours and pay rate
        double grossPay = hours * rate;

        //Display test results
        System.out.println("Your Gross Pay is $" + grossPay);

    }
}
