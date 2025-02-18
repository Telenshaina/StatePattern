package Assignment;

public class OutOfOrderState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Machine is out of order. Cannot select an item.");
    }
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Machine is out of order. Cannot insert coins.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Machine is out of order. Cannot dispense items.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is already out of order.");
    }
    
}