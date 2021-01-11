package javapractice;

import java.util.Scanner;

public class MadLibsTest {
    public static void main(String arg[]){
        //Ask user for season of the year
        System.out.println("Enter season you are in");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //Ask user to describe the season
        System.out.println("Describe the season");
        var adjective = scanner.next();

        //Ask user to enter a number
        System.out.println(" Enter a number");
        int number = scanner.nextInt();
        scanner.close();

        //Display result
        System.out.println("On a " + adjective + " " +season + " I drink a minimum of " + number + " cups of coffee.");
    }
}
