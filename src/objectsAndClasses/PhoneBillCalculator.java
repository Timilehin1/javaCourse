package objectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class PhoneBillCalculator {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int numberOfMinutesUsed;

    public PhoneBillCalculator(){
        id = random.nextInt(6) + 1;
        baseCost = 100;
        allottedMinutes = 50;
        numberOfMinutesUsed =0;
    }
    public PhoneBillCalculator(int id){
        this.id =id;
    }
    public PhoneBillCalculator(int id, double baseCost, int allottedMinutes, int numberOfMinutesUsed){
       this.id =id;
       this.baseCost = baseCost;
       this.allottedMinutes = allottedMinutes;
       this.numberOfMinutesUsed = numberOfMinutesUsed;
    }
    /*public double getOverage(){
        return (numberOfMinutesUsed - allottedMinutes);
        }
     */
    public double calculateOverage(){
        if (numberOfMinutesUsed > allottedMinutes){
            return (numberOfMinutesUsed - allottedMinutes)* 0.25;
        }
        else{
            return 0;
        }
    }
    public double calculateTax(){
        return (calculateOverage() + baseCost) * 0.15;
    }
    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }
    public void setNumberOfMinutes(){
        System.out.println("Input minutes used: ");
        int minuteUsed = scanner.nextInt();
        this.numberOfMinutesUsed = minuteUsed;
        scanner.close();
    }

    public void setBaseCost(int b){
        this.baseCost =b;
    }
    public double getBaseCost(){
        return baseCost;
    }

    public double getBaseUnit(){
        return allottedMinutes;
    }

    public void printBill(){
        System.out.println("ID: "+id);
        System.out.println("Your base cost is $"+ baseCost);
        System.out.println("Your allotted minutes is "+ allottedMinutes + "minutes");
        System.out.println("Your overage is $" + calculateOverage());
        System.out.println("Your  tax is $" + calculateTax());
        System.out.println("Your final total is $" + calculateTotal());
    }
}

