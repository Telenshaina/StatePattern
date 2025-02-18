package Assignment;

public class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Cannot select another item.");
    }
    public void insertCoin(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Coin inserted: " + amount + ". Current balance: " + machine.getBalance());
        if (machine.getBalance() >= machine.getItemPrice()) {
            System.out.println("Disallowing Item Selection");
            machine.setState(new DispensingState());
        }
    }
    public void dispenseItem(VendingMachine machine) {
        if (machine.getBalance() >= machine.getItemPrice()) {
            machine.setState(new DispensingState());
        } else {
            System.out.println("Not enough balance to dispense the item.");
        }
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
   
}