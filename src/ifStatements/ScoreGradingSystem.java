package ifStatements;
//Display a letter grade for a student based on their score

import java.util.Scanner;

public class ScoreGradingSystem {
    public static void main(String args[]){
        //Get student score
        System.out.println("Input your score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //Make grading decision
        char grade;
        if (score < 40){
            grade = 'E';
        }
        else if (score < 50){
            grade = 'D';
        }
        else if (score < 60){
            grade = 'C';
        }
        else if (score  < 70){
            grade = 'B';
        }
        else{
            grade = 'A';
        }
        System.out.println("Your grade is " + grade);

        }
    }

