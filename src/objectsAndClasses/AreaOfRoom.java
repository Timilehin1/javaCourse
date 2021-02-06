package objectsAndClasses;

public class AreaOfRoom {
    public static void main(String args[]){
     double area = getArea();
     double perimeter = getPerimeter();
     System.out.println("Area of room is " + area + "\nPerimeter of room is " + perimeter);
    }
    public static double getArea(){
        Rectangle room4 = new Rectangle();
        room4.setWidth(10);
        room4.setLength(15);
        double areaOfRoom4 = room4.calculateArea();
        return areaOfRoom4;
    }
    public static double getPerimeter(){
        Rectangle room5 = new Rectangle(20, 30);
        double perimeter = room5.calculatePerimeter();
        return perimeter;
    }
}
