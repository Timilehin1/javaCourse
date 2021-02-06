package objectsAndClasses;

public class TestClass {
    private double length;
    private double breadth;

    //Default Constructor
    public TestClass(){
        double length =0;
        double breadth = 0;
    }

    //Another Constructor
    public TestClass(double length, double breadth){
        this.length =length;
        this.breadth = breadth;
    }

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public void setLength(double l){
        this.length = l;
    }
    public void setBreadth(double b){
        this.breadth = b;
    }

    public double calculateA(){
        return 2*(length + breadth);
    }
    public double calculateP(){
        return length * breadth;
    }
}
