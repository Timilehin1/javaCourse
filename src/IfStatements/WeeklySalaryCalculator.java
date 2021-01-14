package IfStatements;

import java.util.Scanner;

/* Sales Person earns $1000 weekly, if sales is greater than or equal to 10, pay $1000
if sales is greater than 10 pay a bonus of $250 per sales difference (Send congratulatory message)
if sales is less than 10, deduct $100 per sales short (Inform employees number of sales short)
*/
public class WeeklySalaryCalculator {
    public static void main(String args[]){
        //Initialize known values
        int salaryWeekly = 1000;
        int bonus = 250;
        int deduction = 100;
        int quota = 10;

        //Get unknown values
        System.out.println("Input number of sales made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision
        if(sales < 10){
            int saleShort = salaryWeekly - ( quota - sales) * deduction;
            System.out.println(" Sorry! You did not meet your weekly target. Your Weekly Salary is $" + saleShort);
        }
        else if (sales >10){
          int salesExcess = salaryWeekly + (sales - quota ) * bonus;
          System.out.println("Congrats! You exceeded your target. Your salary this week is $" + salesExcess );
        }
        else{
            System.out.println("Your weekly salary is $" + salaryWeekly);
        }

    }
}
