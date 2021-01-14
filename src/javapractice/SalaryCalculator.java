package javapractice;

import java.util.Scanner;

/*
we have a team of salespeople, all of whom make a standard rate of $1,000 a week.
For any of them who make more than 10 sales that week, they get an additional bonus of $250.
*/
public class SalaryCalculator {
    public static void main(String args[]){
        //Declare known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        Scanner scanner = new Scanner(System.in);

        //Get unknown values
        System.out.println("Input sales made this week");
        int sales = scanner.nextInt();
        scanner.close();

        //Calculate bonus
        if (sales > quota){
            salary = salary + bonus;
        }

        //Display result
        System.out.println("Your employee salary is $" + salary);
    }
}
