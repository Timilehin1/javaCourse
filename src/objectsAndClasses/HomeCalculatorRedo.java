package objectsAndClasses;

import java.util.Scanner;

public class HomeCalculatorRedo {
    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        HomeCalculatorRedo calculator = new HomeCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);
        calculator.scanner.close();
    }
    public Rectangle getRoom (){
        System.out.println("Input the length of room here:");
        double length = scanner.nextDouble();

        System.out.println("Input the width of room here:");
        double width = scanner.nextDouble();
        /*
        Rectangle room = new Rectangle(length, width);
        return room;*/

        return new Rectangle(length, width);
    }
    public double calculateTotalArea(Rectangle rec1, Rectangle rec2){
        return rec1.calculateArea() + rec2.calculateArea();
    }
}