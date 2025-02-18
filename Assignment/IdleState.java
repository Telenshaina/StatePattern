package Assignment;
public class IdleState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Please Select an Item.");
        System.out.println("Item selected.");
        machine.setState(new ItemSelectedState());
    }
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coin before selecting an item.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Cannot dispense without selecting an item and inserting coins.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
    
}


