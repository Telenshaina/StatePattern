package Assignment;

public class DispensingState implements VendingMachineState {
    

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Cannot insert coins while dispensing.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Already dispensing item.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        vendingMachine.setState(new OutOfOrderState());
        System.out.println("Vending machine is now out of order.");
    }

    @Override
    public void selectItem(VendingMachine machine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectItem'");
    }
}
