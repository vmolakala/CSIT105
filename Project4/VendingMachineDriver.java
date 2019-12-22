import java.util.Scanner;

import csit105project04samplefall19.MoneyType;
import csit105project04samplefall19.Cheese;

/**
 *
 * @author Vikram Molakala
 */
public class VendingMachineDriver {

    public static void main(String[] args) {
        String userInput;
        Scanner keyboard = new Scanner(System.in);
        Cheese itemReturned;
        int rowEntered;
        int colEntered;
        VendingMachine myMachine = new VendingMachine();

            System.out.print("\nInventory: \n");
            myMachine.displayInventory();

        do {
            System.out.print("\nEnter Money (Q,D,N,B) " + "or Command (R,P,I,X): ");
            userInput = keyboard.nextLine();
            switch (userInput.toUpperCase()) {
            case "Q":
                myMachine.addMoney(MoneyType.QUARTER);
                break;
            case "D":
                myMachine.addMoney(MoneyType.DIME);
                break;
            case "N":
                myMachine.addMoney(MoneyType.NICKEL);
                break;
            case "B":
                myMachine.addMoney(MoneyType.DOLLAR_BILL);
                break;
            case "P":
                System.out.print("\nEnterRow: ");
                rowEntered = keyboard.nextInt();
                System.out.print("Enter Col: ");
                colEntered = keyboard.nextInt();
                keyboard.nextLine();
                if (myMachine.validCoordinates(rowEntered, colEntered)) {
                    itemReturned = myMachine.dispenseProduct(rowEntered, colEntered);
                    myMachine.returnMoney();
                } else {
                    System.out.println("\nInvalid Coordinates");
                    System.out.printf("\nBalance: %.2f", myMachine.getBalance());
                }
                break;
            case "I":
                myMachine.displayInventory();
                break;
                case "R":
                System.out.printf("\nMoney Returned: %.2f", myMachine.returnMoney());
                break;
            case "X":
                if (myMachine.getBalance() > 0){
                    System.out.printf("\nUnused balance of: %.2f", myMachine.getBalance());
                }
                System.out.println("\nBye Bye!");
                break;
            default:
                System.out.println("\nYou entered an invalid choice!!");
            }
        } while (!userInput.equalsIgnoreCase("X"));

    }

}
