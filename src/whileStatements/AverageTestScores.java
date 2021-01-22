package whileStatements;

import java.util.Scanner;

//Find the average of each students score in a class
public class AverageTestScores {
    public static void main(String args[]){
        //Initialise known values
        int tests = 4;
        System.out.println("Enter the number of students");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        //Calculate the scores for each student

        for (int i=0; i<numberOfStudents; i++){
            double total= 0;
            for (int j =0; j<tests; j++){
                System.out.println("Input test score #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double totalAverage = total/tests;
            System.out.println("The average score for student #" + (i+1) + " is " + totalAverage);
        }
        scanner.close();
    }
}
