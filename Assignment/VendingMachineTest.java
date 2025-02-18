package Assignment;
public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(3);
        
        machine.selectItem(); // Transition to ItemSelectedState
        machine.insertCoin(5); // Not enough
        machine.insertCoin(5); //transition to DispensingState
        machine.dispenseItem(); // Item dispensed, back to IdleState
        
        machine.setOutOfOrder(); // Transition to OutOfOrderState
        machine.insertCoin(10); //machine is out of order
    }
}
