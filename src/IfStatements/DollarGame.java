package IfStatements;

import java.util.Scanner;

/*
Enter enough change to equal $1. Create a program that asks users to enter quantities of the following coin;
pennies, nickels, dimes and quarters. Your program should count up all the values of the change. if it's exactly
$1, they win! if it's more than $1, tell them by how much they went over. If it's under$1, tell them by how much
they went under.
 */
public class DollarGame {
    public static void main(String args[]){
        //Define coins value
        int oneDollar = 1;
        double onePenny = 0.01;
        double oneNickel = .05;
        double oneDime = .10;
        double quarter = .25;
        // Set total value
        //double totalValue = onePenny * oneNickel * oneDime * quarter;

        //Let users input coin quantities
        System.out.println("Enter how many pennies");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("Enter how many nickels");
        int nickels = scanner.nextInt();

        System.out.println("Enter how many dimes");
        int dimes = scanner.nextInt();

        System.out.println("Enter how many quarters");
        int quarters = scanner.nextInt();
        scanner.close();

        //Calculate users input
        double gameValues = (pennies * onePenny) + (nickels * oneNickel) + (dimes * oneDime) + (quarters * quarter);
        double underValue = gameValues - oneDollar;
        double overValue = oneDollar - gameValues;

        //Make decision
        if ( gameValues == oneDollar){
            System.out.println("Congrats! You've won.");
        }
        else if (gameValues < oneDollar){
            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry! Try again. You are under the required value by " +
                    String.format("%.2f", underValue) + " cents.");
            }
        else {
           System.out.println("Sorry! Try again. You are above the required value by " +
                   String.format("%.2f", overValue) + " cents.");
        }
        }
    }
