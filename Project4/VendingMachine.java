

import csit105project04samplefall19.Cheese;
import csit105project04samplefall19.MoneyType;

//@author: Vikram Molakala
public class VendingMachine {
    private double balance;
    private Cheese[][] inventory = {
            { new Cheese("Cheddar", 150, 2.25, 3), new Cheese("Gouda", 175, 3.75, 6),
                    new Cheese("Swiss", 150, 1.75, 2) },
            { new Cheese("Monterey Jack", 200, 2.90, 6), new Cheese("Monchego", 120, 6.25, 2) },
            { new Cheese("Blue Cheese", 310, 4.25, 4), new Cheese("Danby", 110, 3.30, 4),
                    new Cheese("Havarti", 175, 1.75, 3), new Cheese("Feta", 425, 3.85, 4),
                    new Cheese("Provolone", 130, 4.25, 4) },
            { new Cheese("Alpine Lace", 90, 2.35, 2), new Cheese("Colby Jack", 190, 2.20, 3) },
            { new Cheese("Jarlesberg", 75, 3.45, 2), new Cheese("Colby", 95, .90, 1),
                    new Cheese("Muenster", 350, 2.80, 4) } };

    public VendingMaching() {
        balance =0;
        }

    public double getBalance() {
        return balance;
    }

    /* This is the addMoney method which define the money values */
    public void addMoney(MoneyType newMoney) {
        switch (newMoney) {
        case NICKEL:
            balance += .05;
            break;
        case DIME:
            balance += .10;
            break;
        case QUARTER:
            balance += .25;
            break;
        case DOLLAR_BILL:
            balance += 1.0;
            break;
        }
        System.out.println("\nBalance: " + balance);
    }

    public void displayInventory() {
        int max =0;
        for (int row = 0; row < inventory.length; row++) {
            if(inventory[row].length >max){
            max = inventory[row].length;  
        }
        }
        for (int col =0; col <max; col++){
            System.out.printf(" %20d ", col);
        }
        System.out.printf("\n%20s %20s %20s %20s ",
            " -------------------- ",  " -------------------- ",  " -------------------- ",  " -------------------- ");
            System.out.println();
        
            for(int row=0;row < inventory.length; row++){
                System.out.printf("%d", row);
                for (int col = 0; col <inventory[row].length; col++){
                    System.out.printf(" %-14s %,4.2f ", inventory[row][col].getDescription(), inventory[row][col].getPrice());
                }
                System.out.println();
            }
        
    }
    public Cheese dispenseProduct(int row, int column) {
        if (validCoordinates(row, column) == true) {
            if (balance >= inventory[row][column].getPrice()) {
                balance = balance - inventory[row][column].getPrice();
                System.out.print("\nRecieved Product: Cheese: Descr: " + inventory[row][column].getDescription()
                        + " cal: " + inventory[row][column].getCalories() + " price: "
                        + inventory[row][column].getPrice() + " mo. aged: " + inventory[row][column].getMonthsAged());
            } else {
                System.out.println("\nUnable to dispense!");
            }
        } else {
            return null;
        }
        return null;
    }

    public double returnMoney() {
        if (balance == 0.00) {
            System.out.println("\nNo money to return!");
        } else {
            System.out.println("\nMoney Returned: " + balance);
        }
        balance = balance - balance;
        System.out.println("\nBalance: " + balance);
        return balance;
    }

    public boolean validCoordinates(int row, int column) {
        if (row >= inventory.length || row < 0) {
            return false;
        } else if (column >= inventory[row].length || column < 0) {
            return false;
        } else {
            return true;
        }
    }

}
