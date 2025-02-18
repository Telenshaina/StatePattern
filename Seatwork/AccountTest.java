public class AccountTest{
	public static void main (String[] args){

		Account myAccount = new Account("1234", 10000.0); //set acct to active state
                       myAccount.activate(); // displays "Account is already activated!"

                       //Suspend the account
		myAccount.suspend(); //displays "Account is suspended!"

		//Activate the account
                        myAccount.activate(); //displays "Account is activated!"
		
		//Deposit to the account
	myAccount.deposit(1000.0);// update balance and displays account number and
         // current balance. Call the toString() method in deposit().    	                                

//Withdraw to the account
	myAccount.withdraw(100.0);// update balance and displays account number and
         // current balance. Call the toString() method in withdraw().    	                                

		//Close the account()
		myAccount.close();  //displays "Account is closed!"

		//Activate the account
		myAccount.activate(); // Displays "You cannot activate a closed account!"	

		//Suspend the account
		myAccount.activate(); // Displays " You cannot suspend a closed account!"


		//Withdraw to the account
myAccount.withdraw(500.0);// Show message "You cannot withdraw on a closed                   account!". Call the toString() to show current balance and account number.

		//Deposit to the account
myAccount.deposit(1000.0);// Show message "You cannot deposit on closed                  //account!". Call the toString() to show current balance and account number.
}
}
