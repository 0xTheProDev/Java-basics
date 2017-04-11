class BankAC {
	static int counter = 0;
	String AC_Holder, CustomerID;
	int AC_Number;
	double Balance = 0.0;
	
	BankAC(String arg1, String arg2){
		AC_Holder = arg1;
		CustomerID = arg2;
		AC_Number = ++counter;
	}
	BankAC(String arg1, String arg2, double arg3){
		AC_Holder = arg1;
		CustomerID = arg2;
		AC_Number = ++counter;
		Balance = arg3;
	}
	void instantiate(double arg){
		if (Balance != 0.0)
			throw new IllegalArgumentException("The A/C is already instantiated and active!");
		Balance = arg;
	}
	void deposit(double arg){
		if (arg <= 0.0)
			throw new IllegalArgumentException("Deposit value cannot be null or negative!");
		Balance += arg;
	}
	void withdraw(double arg){
		if (arg <= 0.0)
			throw new IllegalArgumentException("Withdrawal value cannot be null or negative!");
		if (Balance < arg)
			System.out.println("You don't have sufficient Balance in your A/C!");
		else
			Balance -= arg;
	}
	void info(){
		System.out.println("\nAccount Information for: " + AC_Number + "\nA/C Holder: " + AC_Holder + "\nCustomer ID: " + CustomerID + "\nCurrent Bal: " + String.format("%.2f", Balance));
	}
}

class Test {
	public static void main(String args[]){
		BankAC bn = new BankAC("Supratik Roy", "ACOPR5689C");
		bn.instantiate(5000.00);
		bn.deposit(1000.00);
		bn.info();
		bn.withdraw(3000.00);
		bn.info();
	}
}