package Methods;

import java.util.Scanner;

//write a method that asks a user for their name, and then greets them by name
public class Greetings {
    public static void main(String args[]){
        System.out.println("Input your name here");
        Scanner scanner =new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }
    //Greet user method
    public static void greetUser(String name){
        System.out.println("Good day " + name);
    }
}
