package Methods;

import java.util.Scanner;

/*
 Write an instant credit check to approve anyone who makes more than $25,000 and has a credit score of 700
  or better. Reject all others.
 */
public class CreditCheck {
    public static void main(String args[]){
        //Initialize what we know
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        //Get values from user
        System.out.println("Enter your salary here:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score here:");
        int creditScore = scanner.nextInt();
        scanner.close();
        //Check if user is qualified
        if (salary >= requiredSalary && creditScore >= requiredCreditScore){
            System.out.println("Congrats, You qualify for the loan");
        }
        else {
            System.out.println("Sorry! You did not qualify for the loan");
        }
        //Notify user of qualification
    }
}
