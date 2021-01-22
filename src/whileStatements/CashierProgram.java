package whileStatements;

import java.util.Scanner;

/*
Write a cashier program that will scan a given number of items and tell the cost
 */
public class CashierProgram {
    public static void main(String args[]){
        //Get number of items
        System.out.println("Input the number of items");
        Scanner scanner = new Scanner(System.in);
        int items = scanner.nextInt();
        double totalCost = 0;
        for ( int i=0; i<items; i++){
            System.out.println("Input cost of each item");
            double cost = scanner.nextDouble();
            totalCost =  totalCost + cost;
        }
        scanner.close();
        System.out.println("Your total cost is $" + totalCost);
    }
}
