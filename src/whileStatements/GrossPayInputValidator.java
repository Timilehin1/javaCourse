package whileStatements;

import java.util.Scanner;

/*
Each store employee makes $15 and hour.
Write a program that allows a manager to enter the number of weekly hour worked for each employee,
and calculate their pay. Do not allow for overtime.
 */
public class GrossPayInputValidator {
    public static void main(String args[]){
        //Instantiate known values
        int hourlyRate = 15;
        int maxHour = 40;

        //get unknown values
        System.out.println("Enter number of weekly hour worked by an employee");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        double employeePay = hoursWorked * hourlyRate;

        while (hoursWorked > maxHour || hoursWorked < 1){
            System.out.println("Invalid entry! your hours should be between 1 and 40.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        //Calculate gross pay
        double grossPay = hourlyRate * hoursWorked;
        System.out.println("Your gross pay is $" + grossPay);
    }
}
