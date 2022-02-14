package abstraction;

	abstract class Bank {
	
		abstract void credit();
	 	abstract void debit(); 
	 	void display() {
	 		System.out.println("Amount Displayed");
	 	}

}
