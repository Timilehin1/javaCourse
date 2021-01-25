package Methods;

import java.util.Currency;
import java.util.Scanner;

/*
Calculate the final total of someone phone bill
Allow the operator to input the plan fee and number of overage minute
Charge the user 0.25 for every minute they were over their plan and 15% tax on the subtotal
Create separate methods to calculate the tax, overage fees and final total
Print the itemized bill.
 */
public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);
    static double basePlan = 100;
    static double overageMinute = 10;
    static double overage = 0;
    static double tax = 0;
    static double finalTotal = 0;

    public static void main(String args[]){
    //Get minutes used
        double minutesUsed = getMinutesUsed();
        scanner.close();
    //Charge the user 0.25 for minute over their plan
        calculateOverageFees(minutesUsed, overageMinute);
    //Charge user 15% on the subtotal
        calculateTax(basePlan, overage);
    //Calculate total
        calculateFinalTotal(basePlan, overage);
    //Print the user bill
        printBill();
    }
    public static double getMinutesUsed(){
        System.out.println("Input total minutes used here:");
        double minutesUsed = scanner.nextDouble();
        return minutesUsed;
    }
    public static void calculateOverageFees(double minutesUsed, double overageMinute) {
        if(minutesUsed > overageMinute) {
            overage = (minutesUsed - overageMinute) * 0.25;
        }
        else {
                overage = 0;
        }
    }
    public static double calculateTax(double basePlan, double overage){
        double subTotal = basePlan + overage;
        tax = subTotal * 0.15;
        return tax;
    }
    public static double calculateFinalTotal(double basePlan, double overage){
        finalTotal = basePlan + overage + tax;
        return finalTotal;
    }
    public static void printBill(){
            System.out.println("Your base plan is " + String.format("%.2f", basePlan)  + "\nOverage Minutes is " + overageMinute +
                    " \nYour overage is " + overage + " \nYour tax is $" + tax  +
                    " \nYour final total is $" + finalTotal);
        }
}
