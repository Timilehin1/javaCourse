package Methods;

import java.util.Scanner;
/*
 Write an instant credit check to approve anyone who makes more than $25,000 and has a credit score of 700
  or better. Reject all others.
 */
public class MethodsCreditCheck {
    //Initialize what we know
     static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
   static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        //Get salary
        double salary = getSalary();

        //Get Credit score
        int creditScore = getCreditScore();
        scanner.close();

        //Check if user is qualified
        boolean isQualified = isUserQualified(salary, creditScore);

        //Notify user
        notifyUSer(isQualified);
    }
    //Get values from user
    public static double getSalary(){
        System.out.println("Enter your salary here:");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score here:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    //Check if user is qualified
    public static boolean isUserQualified(double salary, int creditScore){
        if (salary >= requiredSalary && creditScore >= requiredCreditScore){
            return true;
        }
        else{
            return false;
        }
    }
    //notify user method
    public static void notifyUSer(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats! You qualified");
        }
        else {
            System.out.println("Sorry! You did not qualify");
        }
    }
}
