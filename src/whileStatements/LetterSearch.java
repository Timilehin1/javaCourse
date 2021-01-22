package whileStatements;

import java.util.Scanner;
/*
Search a string to determine if it contains the letter A
 */
public class LetterSearch {
    public static void main(String args[]){
        //Get user to input word
        System.out.println("Enter a word");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();
        // Search for the letter A
        boolean letterFound = false;
        for (int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter =='a'){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("The text contains the letter 'A' ");
        }
        else {
            System.out.println("This text does not contain the letter 'A' ");
        }
    }
}
