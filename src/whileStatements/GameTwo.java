package whileStatements;

import java.util.Random;
import java.util.Scanner;

/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces
on the game board.
After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
Repeat this 4 additional times, for 5 rolls in total.
However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
If they are greater than or less than 20 spaces exactly, they lose.
Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */
public class GameTwo {
    public static void main(String args[]){
       //Initialize known values
       int entireSpaces = 20;
       int dieRolls = 5;
       int currentSpace = 0;
       Random random = new Random();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Let the game begin......");
       //Declare conditions
       for(int i=0; i<=dieRolls; i++){
           int die = random.nextInt(6) + 1;
           currentSpace = currentSpace + die;
           int spacesToGo = entireSpaces - currentSpace;
           System.out.println("Roll #"+ (i+1) + ":" +
                   "You've rolled a  " + currentSpace + "." +
                   "You are now on space " + currentSpace + "." + " You have "+ spacesToGo + " more to go.");
           System.out.println("Roll again: true or false");
           scanner.nextBoolean();
           //Condition for winning the game
         if(currentSpace == entireSpaces){
               System.out.println("Roll #"+ (i+1) + ":" +
                       "You've rolled a #" + currentSpace + "." +
                       "You are now space " + currentSpace + "Congrats, you win!");
               break;
           }
           else if (currentSpace > entireSpaces){
               System.out.println("Roll #"+ (i+1) + ":" + "You've rolled a #" + currentSpace +
           "." + "Sorry! you've exhausted the entire spaces, You lost the game");
               break;
           }
         else if ((dieRolls == i) && (currentSpace < entireSpaces)) {
             System.out.println("Roll #" + (i+1) + ":" + "You've rolled a #" + currentSpace +
                     "." + "Sorry! you've exhausted the number of die rolls, You lost the game");
             break;
         }
          /* else{
               System.out.println("Roll #"+ (i+1) + ":" +
                       "You've rolled a #" + currentSpace + "." +
                       "You are now on space " + currentSpace + " and have " + spacesToGo + " more to go.");
           }*/
       }
    }
}
