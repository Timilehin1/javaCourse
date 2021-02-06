package objectsAndClasses;
/*
Write a class that creates instances of the Rectangle class to find
the total area of two rooms in a house*/

public class HomeAreaCalculator {
    public static void main(String args[]){
        //Rectangle 1
        Rectangle room1 = new Rectangle();
        room1.setLength(20);
        room1.setWidth(50);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("Area of room 1 is " + areaOfRoom1);

        Rectangle room2 = new Rectangle(15, 20);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("Area of room 2 is " + areaOfRoom2);

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Total area of both room are; " + totalArea);
    }

}
