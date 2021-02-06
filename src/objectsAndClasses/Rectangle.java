package objectsAndClasses;

public class Rectangle {
    private double length;
    private double width;
//Default Constructors to assign default values to the fields.
// They are used to initialize object or set up it's state
    public Rectangle(){
        length=0;
        width=0;
    }
//Another Constructor with known length and width.
    public Rectangle(double length, double width){
        this.length = length;
        setWidth(width);
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public double calculatePerimeter(){
        return ( 2 * length) + (2 * width);
    }
    public double calculateArea(){
        return length * width;
    }
}
