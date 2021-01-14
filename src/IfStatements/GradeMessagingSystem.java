package IfStatements;

import java.util.Scanner;

public class GradeMessagingSystem {
    public static void main(String args[]){
        System.out.println("Input your grade letter");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        //Print message
        String message;
        switch (grade){
            case "A":
                message = "Excellent Job!";
                break;
            case "B":
                message = "Good Job!";
                break;
            case "C":
                message = "Keep pushing!";
                break;
            case "D":
                message = "Try harder!";
                break;
            default:
                message = "Invalid grade letter";
                break;
        }
        System.out.println(message);
    }
}
