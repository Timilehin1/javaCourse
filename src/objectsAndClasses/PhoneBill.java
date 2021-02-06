package objectsAndClasses;

public class PhoneBill {
    PhoneBillCalculator phoneBill = new PhoneBillCalculator();

    public static void main(String args[]){
        PhoneBill bill = new PhoneBill();
        bill.phoneBill.setNumberOfMinutes();
        bill.phoneBill.printBill();
    }

    /*public PhoneBillRedo getMinutesUsed(){
        System.out.println("Input minutes used: ");
        int minuteUsed = scanner.nextInt();
        return phoneBill.setNumberOfMinutes(minuteUsed);
    }
     */
}
