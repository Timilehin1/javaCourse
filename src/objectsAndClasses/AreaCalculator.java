package objectsAndClasses;
/*
Calculate the area of two rooms using a class
 */
public class AreaCalculator {
     TestClass room1 = new TestClass();
     TestClass room2 = new TestClass(16, 10);

    public static void main(String args[]){
        //If you want non-static to access the static main, instantiate the Class.
        AreaCalculator calculator = new AreaCalculator();
        double area1 = calculator.getRoom1Area();
        double area2 = calculator.getRoom2Area();
        double totalArea = calculator.getTotalArea();
        System.out.println("Room 1 area: " + area1 + "\n Room 2 area: " + area2
        +"\n Room total area: " + totalArea);
    }
    public double getRoom1Area(){
        room1.setLength(10);
        room1.setBreadth(20);
        return room1.calculateA();
    }
    public  double getRoom2Area(){
        return room2.calculateA();
    }
    public double getTotalArea(){
        return getRoom1Area() + getRoom2Area();
    }
}
