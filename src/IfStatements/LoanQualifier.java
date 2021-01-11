package IfStatements;

import java.util.Scanner;

/*
To qualify for a loan there are two conditions that must be met.
The person must make at least $30,000 and they must have also been at their job for 2 or more years.
 */
public class LoanQualifier {
    public static void main(String args[]){
        //Initialise known values
        int requiredSalary = 30000;
        int requiredYears = 2;

        //Get salary
        System.out.println("Input monthly salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        //Get numbers of years worked with current employer
        System.out.println("Input numbers of years worked in current firm");
        double yearsWorked = scanner.nextDouble();

        //Make decision
        if (salary >= requiredSalary){
            if(yearsWorked >= requiredYears){
            System.out.println("Congrats! You qualify for this loan.");
            }
            else{
                System.out.println("You need to have worked a minimum of " + requiredYears +
                        "years with current employer.");
            }
        }
        else{
            System.out.print("You need to earn a minimum of " + requiredSalary + " to qualify for this loan");
        }
    }
}
