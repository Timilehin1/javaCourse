package whileStatements;

import java.util.Scanner;

/*
write a program that allows a user to enter 2 numbers and then sum up the two numbers.
The user should be able to repeat this action until they indicate they're done.
 */
public class AddNumbers {
    public static void main(String args[]){
        boolean again;
       do {
           System.out.println("Enter the first number");
           Scanner scanner = new Scanner(System.in);
           double firstNumber = scanner.nextDouble();
           System.out.println("Enter the second number");
           double secondNumber = scanner.nextDouble();
        //Calculate total
            double total = firstNumber + secondNumber;
            System.out.println("Your total number is "+ total);
        //Ask to repeat action
            System.out.println("Do you want to start over? true or false");
            again = scanner.nextBoolean();
            scanner.close();
        // Condition statement
           }
        while (again);
    }
}
