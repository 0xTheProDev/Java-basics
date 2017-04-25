class BankAc {
	String Name, AcNo;
	double balance;
	BankAc(String n, String a) {
		Name = n;
		AcNo = a;
		balance = 0.0;
	}
	BankAc(String n, String a, double b) {
		Name = n;
		AcNo = a;
		balance = b;
	}
	void deposit(double am) {
		balance += am;
	}
	void withdraw(double am) throws java.lang.Exception {
		if (balance <= am)
			throw new Exception("Insufficient balance!");
		balance -= am;
	}
}

class Test {
	public static void main(String args[]) {
		BankAc me = new BankAc("Bhuban Bam", "5461dw1989ew", 2000);
		System.out.println("Initial Balance: " + me.balance);
		for (int i = 0; i <= 10; i++){
			try {
				me.withdraw(200);
				System.out.println("Current Balance: " + me.balance);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
