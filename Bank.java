package CoreJavaProgram;

public class Bank {
	String custName;
	int accNo;
	double initialBal;
	public Bank(String custName,int accNo,double initialBal) {
		this.custName=custName;
		this.accNo=accNo;
		this.initialBal=initialBal;
	}
	void deposit(double amount) {
		initialBal=initialBal+amount;
		System.out.println("The total amount after deposited: "+initialBal);
	}
    void withdraw(double amount) {
		initialBal=initialBal-amount;
		System.out.println("The total amount after withdrawl of money: "+initialBal);
    }
    void show() {
    	System.out.println("Customer Name:"+custName);
    	System.out.println("Account Number:"+accNo);
    	System.out.println("Initial Balance:"+initialBal);
    }
	public static void main(String[] args) {
		Bank b=new Bank("Prasanna",234567,100000.0);
		b.show();
		b.deposit(2000);
		b.show();
		b.withdraw(1300);
		b.show();

	}

}